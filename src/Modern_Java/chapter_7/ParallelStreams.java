package Modern_Java.chapter_7;

import java.util.function.Function;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class ParallelStreams {

    public static void main(String[] args) {
        sequentialSum(3);
        parallelSequentialSum(10);
        parallelSequentialSumWithRangeClose(100);


        System.out.println("SideEffect parallel sum done in: " +
                measurePerf(ParallelStreams::sideEffectParallelSum, 10_000_000L) + " msecs");
    }

    public static long sequentialSum(long n) {
        return Stream.iterate(1L, i -> i + 1)
                .limit(n)
                .reduce(0L, Long::sum);
    }

    //«Под капотом» происходит установка булева флага,
    // который указывает, что все следующие за parallel
    // операции необходимо выполнять параллельно.
    //В этом примере конвейер будет выполняться параллельно,
    // поскольку последним в нем был вызов метода parallel.
    public static long parallelSequentialSum(long n) {
        return Stream.iterate(1L, i -> i + 1)
                .limit(n)
                .parallel()
                .reduce(0L, Long::sum);
    }

    //Процесс распараллеливания требует рекурсивного разбиения потока данных,
    // распределения операций свертки по различным потокам выполнения и последующего
    // объединения результатов этих операций в единое значение. Но перемещение данных
    // между различными ядрами процессора требует больше ресурсов, чем вы можете предположить,
    // так что выполняемые параллельно на другом ядре вычисления должны занимать больше времени,
    // чем перемещение данных с одного ядра на другое.
    public static long parallelSequentialSumWithRangeClose(long n) {
        return LongStream.rangeClosed(1, n)
                .parallel()
                .reduce(0L, Long::sum);
    }

    //Основная причина ошибок, возникающих вследствие неправильного применения
    // параллельных потоков данных, — применение алгоритмов, меняющих какое-либо
    // совместно используемое состояние.


    public static long sideEffectSum(long n) {
        Accumulator accumulator = new Accumulator();
        LongStream.rangeClosed(1, n).forEach(accumulator::add);
        return accumulator.total;
    }
//Причина этого состоит в конкурентном обращении нескольких потоков
// выполнения к одному накопителю и, в частности, в выполнении оператора
// total += value, который, вопреки первому впечатлению, отнюдь не атомарный.
// Источник проблемы — побочный эффект метода, вызываемого внутри блока forEach,
// в виде изменения состояния объекта, совместно используемого в нескольких
// потоках выполнения. Избегайте подобных ситуаций, если не хотите сталкиваться
// с неприятными неожиданностями при использовании параллельных потоков данных

    public static long sideEffectParallelSum(long n) {
        Accumulator accumulator = new Accumulator();
        LongStream.rangeClosed(1, n)
                .parallel()
                //избегайте совместного использования изменяемого состояния,
                // и ваш параллельный поток данных вернет правильный результат.
                //.forEach(accumulator::add);
                .forEachOrdered(accumulator::add);
        return accumulator.total;
    }


    public static class Accumulator {

        private long total = 0;

        public void add(long value) {
            total += value;
        }

    }

    public static <T, R> long measurePerf(Function<T, R> f, T input) {
        long fastest = Long.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            long start = System.nanoTime();
            R result = f.apply(input);
            long duration = (System.nanoTime() - start) / 1_000_000;
            System.out.println("Result: " + result);
            if (duration < fastest) {
                fastest = duration;
            }
        }
        return fastest;
    }

}
