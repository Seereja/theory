package Modern_Java.chapter_4;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 400, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH)
        );


// Java 7;
        System.out.println("getLowCaloricDishesNamesInJava7");
        getLowCaloricDishesNamesInJava7(Dish.menu).forEach(System.out::println);
        System.out.println();
        // Java 8;
        System.out.println("getLowCaloricDishesNamesInJava8");

        getLowCaloricDishesNamesInJava8(Dish.menu).forEach(System.out::println);
        System.out.println();
        System.out.println("getHighCaloricDishesName");
        getHighCaloricDishesName(Dish.menu).forEach(System.out::println);
        System.out.println();
        System.out.println("getChickenAndPrawnsCaloricDishesName");
        getChickenAndPrawnsCaloricDishesName(Dish.menu).forEach(System.out::println);

        List<Dish> list = new ArrayList<>();
        list.stream()
                .filter(dish -> dish.getCalories() > 300)
                .sorted(comparing(Dish::getCalories))
                .limit(5)
                .map(Dish::getName)
                .collect(toList());
        System.out.println(list);


//        System.out.println();
//        System.out.println("Сортировка");
//        menu.sort(Comparator.comparing(Dish::getCalories));
//        for (Dish element : menu) {
//            System.out.println(element);
//        }


        //Два варианта внутренних и внещних итераций


        List<String> names = new ArrayList<>();
        //внешняя итерация
        Iterator<Dish> name2 = menu.iterator();
        while (name2.hasNext()) {
            Dish dish = name2.next();
            names.add(dish.getName());
        }
        System.out.println();
        System.out.println("//внешняя итерация");
        System.out.println(names);
        System.out.println();
        System.out.println("Потоки данных: внутренняя итерация");
        menu.stream()
                .map(Dish::getName)
                .toList()
                .forEach(System.out::println);

        System.out.println("Промежуточные операции");
        List<String> names3 = menu.stream()
                .filter(dish -> {
                    System.out.println("filtering " + dish.getName());
                    return dish.getCalories() > 300;
                })
                .map(dish -> {
                    System.out.println("mapping: " + dish.getName());
                    return dish.getName();
                })
                .limit(3)
                .collect(toList());
        System.out.println(names3);

        System.out.println();
        List<Dish> vegetarianDishes = menu.stream()
                .filter(Dish::isVegetarian)
                .toList();
        System.out.print(vegetarianDishes + " ");

        List<Dish> dishesDropWhile = menu.stream()
                .dropWhile(dish -> dish.getCalories() < 320)
                .toList();
        System.out.print(dishesDropWhile + " ");
        System.out.println();
        List<Dish> dishesTakeWhile = menu.stream()
                .takeWhile(dish -> dish.getCalories() < 320)
                .collect(toList());
        System.out.println(dishesTakeWhile);

        System.out.println("Контрольное задание 5.1. Фильтрация");
        menu.stream()
                .filter(dish -> dish.getType() == Dish.Type.MEAT)
                .limit(2)
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);




    }


    private static List<String> getChickenAndPrawnsCaloricDishesName(List<Dish> dishes) {
        return dishes.stream()
                .filter(dish -> dish.getName().equals("chicken") || dish.getName().equals("prawns"))
                .map(Dish::getName)
                .collect(toList());
    }

    private static List<String> getHighCaloricDishesName(List<Dish> dishes) {
        return dishes.stream()
                .filter(dish -> dish.getCalories() > 300)
                .sorted(comparing(Dish::getCalories))
                .map(Dish::getName)
                .limit(3)
                .collect(toList());

    }


    private static List<String> getLowCaloricDishesNamesInJava7(List<Dish> dishes) {
        List<Dish> lowCaloriesDishes = new ArrayList<>();
        for (Dish element : dishes) {
            if (element.getCalories() < 400) {
                lowCaloriesDishes.add(element);
            }
        }
        List<String> lowCaloriesDishesName = new ArrayList<>();
        Collections.sort(lowCaloriesDishes, comparing(Dish::getCalories));

        for (Dish d : lowCaloriesDishes) {
            lowCaloriesDishesName.add(d.getName());
        }
        return lowCaloriesDishesName;
    }

    private static List<String> getLowCaloricDishesNamesInJava8(List<Dish> dishes) {
        return dishes.stream()
                .filter(dish -> dish.getCalories() < 400)
                .sorted(comparing(Dish::getCalories))
                .map(Dish::getName)
                .collect(toList());
    }


}
