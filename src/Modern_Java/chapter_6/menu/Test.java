package Modern_Java.chapter_6.menu;


import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static Modern_Java.chapter_6.menu.Dish.menu;
import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;
import static Modern_Java.chapter_6.menu.Dish.dishTags;

public class Test {
    public static void main(String[] args) {


        String shortMenu = menu.stream().map(Dish::toString).collect(joining(", "));
        System.out.println(shortMenu);

        Comparator<Dish> comparatorMenu = Comparator.comparing(Dish::getCalories);
        Optional<Dish> mostCalories = menu.stream().collect(maxBy(comparatorMenu));
        System.out.println(mostCalories);

        int totalCalories = menu.stream().collect(summingInt(Dish::getCalories));
        System.out.println(totalCalories);

        double avgCalories = menu.stream().collect(averagingInt(Dish::getCalories));
        System.out.println(avgCalories);

        IntSummaryStatistics menuStatistics = menu.stream().collect(summarizingInt(Dish::getCalories));
        System.out.println(menuStatistics);

        //Он принимает три аргумента.

        //Первый аргумент — начальное значение для операции свертки,
        // а равно и значение, возвращаемое при отсутствии элементов в потоке,
        // так что в случае суммирования чисел явно лучше всего подходит 0.


        //Второй аргумент — та же функция, с помощью которой мы в подразделе
        // 6.2.2 преобразовывали блюдо в значение типа int,
        // соответствующее количеству содержащихся в нем калорий.

        //Третий аргумент — BinaryOperator,
        // который агрегирует два элемента в одно значение того же типа.
        // В данном случае он суммирует два значения типа int.
        int totalCalories1 = menu.stream().collect(Collectors.reducing(0, Dish::getCalories, (i, j) -> i + j));
        System.out.println("Collectors.reducing(0, Dish::getCalories, (i, j) -> i + j)");
        System.out.println(totalCalories1);
        int totalCalories2 = menu.stream().collect(Collectors.reducing(0, Dish::getCalories, Integer::sum));
        System.out.println("Collectors.reducing(0, Dish::getCalories, Integer::sum");
        System.out.println(totalCalories2);

        //Аналогичным образом можно найти самое калорийное блюдо с помощью одноаргументной версии метода reducing:
        System.out.println("collect(reducing((d1, d2) -> d1.getCalories() > d2.getCalories() ? d1 : d2)) ");
        Optional<Dish> mostCalories1 = menu.stream()
                .collect(reducing((d1, d2) -> d1.getCalories() > d2.getCalories() ? d1 : d2));
        System.out.println(mostCalories1);
        System.out.println();
        String shortMenu1 = menu.stream().map(Dish::getName)
                .collect(reducing(String::concat)).get();
        System.out.println(shortMenu1);
        System.out.println();
        String shortMenu2 = menu.stream().
                collect(reducing("", Dish::getName, String::concat));
        System.out.println(shortMenu2);
        System.out.println();

        //ГРУППИРОВКА
        //groupingBy
        Map<Dish.Type, List<Dish>> dishTape = menu.stream().collect(groupingBy(Dish::getType));
        for (Map.Entry<Dish.Type, List<Dish>> entry : dishTape.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("Использование ENUM как ключа для группировки");

        Map<CaloricLevel, List<Dish>> caloricLevelListMap =
                menu.stream()
                        .collect(groupingBy(dish -> {
                            if (dish.getCalories() <= 400)
                                return CaloricLevel.DIET;
                            else if (dish.getCalories() <= 700)
                                return CaloricLevel.NORMAL;
                            else {
                                return CaloricLevel.FAT;
                            }
                        }));

        for (Map.Entry<CaloricLevel, List<Dish>> entry : caloricLevelListMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("filtering");

        //filtering — еще один статический фабричный метод класса Collectors, принимающий в качестве параметров
        // предикат для фильтрации элементов в каждой из групп и еще один коллектор для
        // перегруппировки профильтрованных элементов. Таким образом,
        // в получившемся ассоциативном массиве останется запись для типа FISH,
        // хотя и представляющая собой пустой список:

        Map<Dish.Type, List<Dish>> typeListMap = menu.stream()
                .collect(groupingBy(Dish::getType, filtering(dish -> dish.getCalories() > 500, toList())));

        for (Map.Entry<Dish.Type, List<Dish>> entry : typeListMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //Collectors предоставляет еще один коллектор в виде метода mapping.
        // Он принимает на входе функцию отображения и другой коллектор,
        // предназначенный для группировки элементов, полученных в результате применения этой функции.
        // С его помощью можно, например, преобразовать все Dish в группах в их названия:

        System.out.println("mapping");
        Map<Dish.Type, List<String>> typeListMap1 = menu.stream()
                .collect(groupingBy(Dish::getType, mapping(Dish::getName, toList())));

        //Отметим, что в этом случае каждая из групп получившегося ассоциативного
        // массива представляет собой список строк, а не одно из блюд, как в предыдущих примерах.

        for (Map.Entry<Dish.Type, List<String>> entry : typeListMap1.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


//        System.out.println("flatMapping");

        //При необходимости можно легко извлечь эти пометки для
        // каждой группы типа блюд с помощью коллектора flatMapping
//        Map<Dish.Type, Set<Dish>> dishNamesByType = menu.stream()
//                .collect(groupingBy(Dish::getType, flatMapping(dish -> dishTape.get(dish.getName()).stream(), toSet())));
//
//        for (Map.Entry<Dish.Type, Set<Dish>> entry : dishNamesByType.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }

        //6.3.2. Многоуровневая группировка
        //элементами групп, можно воспользоваться и для группировки второго уровня.
        // Для этого можно передать внешнему методу groupingBy второй внутренний groupingBy,
        // задав в нем критерий второго уровня для классификации элементов потока,


        //В целом удобно считать, что groupingBy работает с термином «корзина».
        // Первый groupingBy создает корзины для всех ключей.
        // А затем уже можно с помощью расположенного далее по конвейеру коллектора
        // собрать элементы потока в каждой из корзин и т. д., вплоть до n-уровневой группировки!

        Map<Dish.Type, Map<CaloricLevel, List<Dish>>> dishesByTypeCaloriesLevel = menu.stream()
                .collect(groupingBy(Dish::getType,
                                groupingBy(dish -> {
                                    if (dish.getCalories() <= 400)
                                        return CaloricLevel.DIET;
                                    else if (dish.getCalories() <= 700)
                                        return CaloricLevel.NORMAL;
                                    else {
                                        return CaloricLevel.FAT;
                                    }
                                })
                        )
                );


        for (Map.Entry<Dish.Type, Map<CaloricLevel, List<Dish>>> entry : dishesByTypeCaloriesLevel.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        //Сбор данных в подгруппы
//Например, можно подсчитать число блюд в меню для каждого из типов блюд,
// передав коллектор counting в качестве второго аргумента в коллектор groupingBy

        Set<Map.Entry<Dish.Type, Long>> typeLongMap = menu.stream().collect(groupingBy(Dish::getType, counting())).entrySet();
        System.out.println(typeLongMap);
        //Отметим также, что обычная операция groupingBy(f)
        // с одним аргументом f — функцией классификации —
        // фактически является сокращенной записью groupingBy(f, toList()).


        //В качестве еще одного примера мы можем переделать коллектор,
        // уже применявшийся для поиска самого калорийного блюда в меню,
        // и получить аналогичный результат, только с классификацией по типу блюда:
        Set<Map.Entry<Dish.Type, Optional<Dish>>> typeOptionalMap = menu
                .stream()
                .collect(groupingBy(Dish::getType,
                        maxBy(comparingInt(Dish::getCalories)))).entrySet();
        System.out.println(typeOptionalMap);
        System.out.println();


        //для преобразования возвращенного коллектором
        // результата к другому типу можно воспользоваться
        // коллектором, возвращаемым фабричным методом Collectors.collectingAndThen
        System.out.println();
        Map<Dish.Type, Dish> mostCaloriesByType = menu.stream()
                .collect(groupingBy(Dish::getType, collectingAndThen(maxBy(Comparator.comparingInt(Dish::getCalories)), Optional::get)));

        for (Map.Entry<Dish.Type, Dish> entry : mostCaloriesByType.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //передаваемый в качестве второго аргумента в фабричный метод groupingBy,
        // затем используется для последующей свертки всех элементов потока данных,
        // отнесенных при классификации в одну группу.

        Set<Map.Entry<Dish.Type, Integer>> totalCaloriesByType = menu.stream()
                .collect(
                        groupingBy
                                (Dish::getType, summingInt(Dish::getCalories))).entrySet();
        System.out.println(totalCaloriesByType);
        System.out.println();
        //Кроме того, в сочетании с groupingBy часто применяется коллектор,
        // генерируемый методом mapping. Этот метод принимает два аргумента:
        // функцию преобразования элементов потока и еще один коллектор, служащий
        // для накопления полученных в результате такого преобразования объектов.
        // Он выступает в качестве адаптера между коллектором, принимающим объекты
        // одного типа, и коллектором, работающим
        // с объектами другого типа, за счет того, что перед попаданием в
        // накопитель к каждому из входящих элементов применяется функция отображения


        //Допустим, мы хотим узнать, какие уровни калорийности присутствуют в меню для каждого из типов блюд.

        Map<Dish.Type, Set<CaloricLevel>> caloricLevelByType = menu.stream()
                .collect(groupingBy(Dish::getType, mapping(dish -> {
                    if (dish.getCalories() <= 400) {
                        return CaloricLevel.DIET;
                    } else if (dish.getCalories() <= 700) {
                        return CaloricLevel.NORMAL;
                    } else {
                        return CaloricLevel.FAT;
                    }
                }, toCollection(TreeSet::new))));
        System.out.println(caloricLevelByType);


        //6.4. Секционирование

        //Секционирование — частный случай группировки, при котором в качестве функции
        //классификации используется предикат, называемый секционирующей функцией
        //(partitioning function)

        //Поскольку секционирующая функция возвращает булево
        //значение, то тип ключа итогового ассоциативного массива группировки должен
        //быть Boolean, а, следовательно, количество различных групп не может превышать
        //двух — одна для true и одна для false


        //Например, если вы вегетарианец или позвали
        //на обед друга-вегетарианца, то вам может понадобиться разделить блюда в меню на
        //вегетарианские и невегетарианские
        System.out.println();
        Map<Boolean, List<Dish>> partitionedMenu = menu.stream()
                .collect(partitioningBy(Dish::isVegetarian));
        for (Map.Entry<Boolean, List<Dish>> entry : partitionedMenu.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println();
        //Также, как вы уже видели
        //в случае группировки, у фабричного метода partitioningBy есть перегруженная
        //версия, в которую можно передать второй коллектор,
        Map<Boolean, Map<Dish.Type, List<Dish>>> partitionedMenuOfType =
                menu.stream()
                        .collect(partitioningBy(Dish::isVegetarian, groupingBy(Dish::getType)));
        for (Map.Entry<Boolean, Map<Dish.Type, List<Dish>>> entry : partitionedMenuOfType.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


        Map<Boolean, Dish> theMostCaloriecDishe = menu.stream()
                .collect(
                        partitioningBy
                                (Dish::isVegetarian, collectingAndThen(maxBy(comparingInt(Dish::getCalories)), Optional::get)));


        //Секционирование чисел на простые и составные


        //Предположим, вы хотите написать метод,
        // принимающий в качестве аргумента число
        // n типа int и разбивающий первые n натуральных
        // чисел на простые и составные. Но сначала нужно
        // написать предикат для проверки,
        // является ли заданное число простым:




        System.out.println();
        // задание для максима
        int[] array = {1, 2, 3, 5, 5, 6, 7,};
//        List<int[]> list = Arrays.asList(array);
//        Set<Integer> allElements = Arrays.stream(array).boxed().collect(Collectors.toSet());
//        Arrays.stream(array).filter(i -> !allElements.remove(i)).distinct().forEach(System.out::println);
//        System.out.println();
        Arrays.stream(array).boxed()
                .collect(Collectors.groupingBy(s -> s, counting()))
                .entrySet().forEach(System.out::println);


    }
}
