package Modern_Java.chapter_6.myCollector;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

import static Modern_Java.chapter_6.myCollector.PartitionPrimeNumbers.isPrime;
import static java.util.stream.Collector.Characteristics.IDENTITY_FINISH;

public class PrimeNumbersCollector implements Collector<Integer, Map<Boolean, List<Integer>>, Map<Boolean, List<Integer>>> {
    @Override
    public Supplier<Map<Boolean, List<Integer>>> supplier() {
        return () -> new HashMap<>() {{
            put(true, new ArrayList<>());
            put(false, new ArrayList<>());
        }};
    }

    //В этом коде ассоциативный массив —
    // будущий накопитель — не только создается,
    // но и инициализируется двумя пустыми списками
    // для ключей true и false. Именно в них мы будем
    // добавлять простые и составные числа соответственно
    // во время процесса сбора данных. Важнейший метод
    // нашего коллектора — accumulator,
    //содержащий логику сбора элементов потока данных.
    // В данном случае этот метод также является ключом к
    // выполнению описанной выше оптимизации.
    // На любой итерации цикла у нас теперь
    // есть доступ к промежуточным результатам
    // процесса сбора данных — к накопителю,
    // содержащему найденные на этот момент простые числа:
    @Override
    public BiConsumer<Map<Boolean, List<Integer>>, Integer> accumulator() {
        return (Map<Boolean, List<Integer>> acc, Integer candidate) -> {
            acc.get(isPrime(acc.get(true), candidate))
                    .add(candidate);
        };
    }

    //В этом методе мы вызываем метод isPrime, передавая в него
    // (вместе с проверяемым на простоту числом) список уже найденных
    // простых чисел (то есть значения, индексированные ключом true в
    // ассоциативном массиве-накопителе). Результат этого
    // вызова далее используется в качестве ключа для получения
    // списка простых или составных чисел, так что новое число
    // добавляется в нужный список.

    @Override
    public BinaryOperator<Map<Boolean, List<Integer>>> combiner() {
        return (Map<Boolean, List<Integer>> map1, Map<Boolean, List<Integer>> map2) -> {
            map1.get(true).addAll(map2.get(true));
            map1.get(false).addAll(map2.get(false));
            return map1;
        };
    }

    //Задача следующего метода состоит
    // в объединении двух частичных накопителей
    // при параллельном
    // процессе сбора данных, то есть
    // в данном случае в объединении двух
    // ассоциативных массивов: добавлении
    // всех чисел из списков простых/составных
    // чисел второго ассоциативного массива
    // в соответствующие списки первого:
    //Отметим, что на самом деле не получится использовать этот коллектор в параллельном
    // режиме, поскольку данный алгоритм по своей сути является последовательным.
    // Это значит, что метод combiner никогда не будет вызываться и его реализацию
    // можно оставить пустой (или, что предпочтительнее, генерировать в ней исключение
    // UnsupportedOperationException). Мы приняли решение реализовать его просто для полноты.

    @Override
    public Function<Map<Boolean, List<Integer>>, Map<Boolean, List<Integer>>> finisher() {
        return i -> i;
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Collections.unmodifiableSet(EnumSet.of(IDENTITY_FINISH));
    }


}
