package Modern_Java.chapter_5.numericStreams;

import Modern_Java.chapter_4.Dish;

import java.util.OptionalInt;
import java.util.stream.IntStream;

import static Modern_Java.chapter_4.Dish.menu;

public class NumericStreams {
    public static void main(String[] args) {

        OptionalInt maxCalories = menu.stream()
                .mapToInt(Dish::getCalories)
                .max();


        int max = maxCalories.orElse(1);
        System.out.println(max);
//        int max;
//        if (maxCalories.isPresent()) {
//            max = maxCalories.getAsInt();
//        } else {
//            // we can choose a default value
//            max = 1;
//        }
//        System.out.println(max);


        // numeric ranges
        System.out.println(" // numeric ranges");
        System.out.println();
        IntStream evenNumbers = IntStream.rangeClosed(1, 100)
                .filter(x -> x % 2 == 0);
        System.out.println(evenNumbers.count());


        System.out.println("Отметим, что если бы мы вызвали вместо этого IntStream.range(1, 100), \n" +
                " то получили бы результат 49, поскольку метод range не включает границы диапазона.");

        IntStream evenNumber2 = IntStream.range(1, 100)
                .filter(x -> x % 2 == 0);
        System.out.println(evenNumber2.count());
    }
}
