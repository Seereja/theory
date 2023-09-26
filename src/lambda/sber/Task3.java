package lambda.sber;

import Modern_Java.chapter_3.functionInterface.function.Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;

public class Task3 {

    public static void main(String[] args) {


        ArrayList namesList = new ArrayList<>();

        namesList.add("Alex");
        namesList.add("Sergey");
        namesList.add("Vadim");
        namesList.add("Kirill");

        Supplier<String> random = () -> {
            int value = (int) (Math.random() * namesList.size());
            return namesList.get(value).toString();
        };
        System.out.println(random.get());

        Function<String, Integer> stringIntegerFunction = Integer::valueOf;
        System.out.println(stringIntegerFunction.apply("450"));
    }


}