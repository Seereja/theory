package lambda.sber.task6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> arrayList = List.of("Sam", "Jame", "Elena", "Sergey", "Joe", "Sam", "Sergey");

        arrayList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .forEach(System.out::println);
    }
}
