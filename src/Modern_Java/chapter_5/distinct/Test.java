package Modern_Java.chapter_5.distinct;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Hello", "World");

        words.stream()
                .map(a -> a.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .forEach(System.out::println);


        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.stream(array1)
                .map(x -> x * x)
                .forEach(System.out::println);

        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);
        List<int[]> pairs =
                numbers1.stream()
                        .flatMap(i ->
                                numbers2.stream()
                                        .map(j -> new int[]{i, j})
                        )
                        .toList();

        System.out.println(Arrays.toString(pairs.toArray()));

        System.out.println("______________________________");
        List<int[]> pairs2 =
                numbers1.stream()
                        .flatMap(i -> numbers2.stream()
                                .filter(j -> (i + j) % 3 == 0)
                                .map(j -> new int[]{i, j})
                        )
                        .toList();
        System.out.println(pairs2);

    }
}
