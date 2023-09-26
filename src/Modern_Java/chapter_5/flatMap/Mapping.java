package Modern_Java.chapter_5.flatMap;

import java.util.Arrays;
import java.util.List;

import static Modern_Java.chapter_5.flatMap.Dish.menu;
import static java.util.stream.Collectors.toList;

public class Mapping {
    public static void main(String[] args) {
        // map
        List<String> dishNames = menu.stream()
                .map(Dish::getName)
                .collect(toList());
        System.out.println(dishNames);

        // map
        List<String> words = Arrays.asList("Hello", "World");
        List<Integer> wordLengths = words.stream()
                .map(String::length)
                .collect(toList());
        System.out.println(wordLengths);


        //flatMap

        words.stream()
                .flatMap((String line) -> Arrays
                        .stream(line.split("")))
                .distinct()
                .forEach(System.out::println);


        // flatMap
        List<Integer> integers1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> integers2 = Arrays.asList(6, 7, 8);
        List<int[]> pairs = integers1.stream()
                .flatMap(i -> integers2.stream()
                        .map(j -> new int[]{i, j})
                )
                .filter(pair -> (pair[0] + pair[1] % 3 == 0))
                .toList();
        pairs.forEach(pair -> System.out.printf("(%d, %d)", pair[0], pair[1]));

    }
}
