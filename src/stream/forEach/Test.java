package stream.forEach;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 9, 10};

        Arrays.stream(array).forEach(value -> {
            value *= 2;
            System.out.println(value);
        });


        String[] array1 = new String[]{"Один", "Два", "Три", "Четыре"};

        Arrays.stream(array1).forEach(System.out::println);
    }

}
