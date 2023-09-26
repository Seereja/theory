package Modern_Java.chapter_5.streamData;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("Modern", "Java", "in", "Action");
        stream.map(String::toUpperCase).forEach(System.out::println);
        System.out.println("Для получения пустого потока данных можно воспользоваться методом empty:");

        Stream<String> stream1 = Stream.empty();
        System.out.println(stream1);


        System.out.println("Создание потока данных из объекта," +
                " допускающего неопределенное значение\n" +
                "В Java");
        String value = "пук пук";
        String homeValue = System.getProperty("home");
        Stream<String> homeValueString = homeValue == null ? Stream.empty() : Stream.of(value);

        System.out.println();

        System.out.println("С помощью метода Stream.ofNullable можно упростить код:");

        Stream<String> homeValueString1 = Stream.ofNullable(System.getProperty("home"));

        System.out.println();

        System.out.println("Этот паттерн особенно удобен в сочетании с методом \n" +
                " flatMap и потоком значений, среди которых могут быть объекты со значением null:");

        Stream<String> values = Stream.of("config", "home", "user")
                .flatMap(key -> Stream.ofNullable(System.getProperty(key)));

        System.out.println();

        System.out.println("Создание потоков данных из файлов");

        long uniqWords = 0;

        try (Stream<String> lines = Files.lines(Paths.get("newOutput.txt"), Charset.defaultCharset())) {
            uniqWords = lines.flatMap(line -> Arrays.stream(line.split(" ")))
                    .distinct()
                    .count();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(uniqWords);

        System.out.println();


        System.out.println("Потоки на основе функций: создание бесконечных потоков");

        System.out.println("Stream.iterate и Stream.generate. " +
                "С помощью этих двух операций можно создать то, что называется" +
                " бесконечным потоком данных (infinite stream):" +
                " поток данных без фиксированного размера, в отличие " +
                "от потока, созданного из конкретной коллекции.");

        System.out.println();

        //для прекращения бесконечного потока необходимо указать лимит
        System.out.println("Метод iterate");

        System.out.println();

        Stream.iterate(0, n -> n + 2).limit(10).forEach(System.out::println);

        System.out.println();
        System.out.println("Ряд двоек чисел Фибоначчи");
        System.out.println();
        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(20)
                .map(t -> t[0])
//                .forEach(t -> System.out.println("(" + t[0] + "," + t[1] + ")"));
                .forEach(System.out::println);

        System.out.println();

        System.out.println("В Java 9 в метод iterate была добавлена поддержка предикатов.");

        Stream.iterate(0, n -> n < 100, n -> n + 4)
                .forEach(System.out::println);


        System.out.println("Метод generate");

        
    }
}
