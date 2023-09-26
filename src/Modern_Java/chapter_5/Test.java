package Modern_Java.chapter_5;

import Modern_Java.chapter_4.Dish;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        List<Modern_Java.chapter_4.Dish> menu = Arrays.asList(
                new Modern_Java.chapter_4.Dish("pork", false, 800, Modern_Java.chapter_4.Dish.Type.MEAT),
                new Modern_Java.chapter_4.Dish("beef", false, 700, Modern_Java.chapter_4.Dish.Type.MEAT),
                new Modern_Java.chapter_4.Dish("chicken", false, 400, Modern_Java.chapter_4.Dish.Type.MEAT),
                new Modern_Java.chapter_4.Dish("french fries", true, 530, Modern_Java.chapter_4.Dish.Type.OTHER),
                new Modern_Java.chapter_4.Dish("rice", true, 350, Modern_Java.chapter_4.Dish.Type.OTHER),
                new Modern_Java.chapter_4.Dish("season fruit", true, 120, Modern_Java.chapter_4.Dish.Type.OTHER),
                new Modern_Java.chapter_4.Dish("pizza", true, 550, Modern_Java.chapter_4.Dish.Type.OTHER),
                new Modern_Java.chapter_4.Dish("prawns", false, 400, Modern_Java.chapter_4.Dish.Type.FISH),
                new Modern_Java.chapter_4.Dish("salmon", false, 450, Dish.Type.FISH)
        );


        Optional<Integer> count = menu.stream().map(d -> 1).reduce(Integer::sum);
        System.out.println(count);

        long count1 = menu.stream().count();
        System.out.println(count1);


        int sumCalories = menu.stream()
                .map(Dish::getCalories)
                .reduce(0, Integer::sum);
        System.out.println("sumCalories .reduce(0, Integer::sum); " + sumCalories);

        int sumCaloriesOfInt = menu.stream()
                .mapToInt(Dish::getCalories)
                .sum();
        System.out.println("sumCaloriesOfInt " + sumCaloriesOfInt);

        int maxCalories = menu.stream()
                .mapToInt(Dish::getCalories)
                .max().getAsInt();
        System.out.println(maxCalories);

        IntStream intStream = menu.stream()
                .mapToInt(Dish::getCalories);
        Stream<Integer> stream = intStream.boxed();
        System.out.println(Arrays.toString(stream.toArray()));
    }
}
