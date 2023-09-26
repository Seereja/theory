package collection.arrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TaskWithArrays {
    public static void main(String[] args) {

        int[] array = {1, 231, 124, 51, 123, 5125, 12345, -123, -1232114, 44, 125, 212, 424};

        System.out.println(Arrays.toString(array));
        System.out.println();
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int result = Arrays.binarySearch(array, 231);
        System.out.println(result);

        List<Integer> array1 = Arrays.asList(1, 124, 51235152, 512431, 2132135, 1525, 123, 535, 123, 5);
        System.out.println(array1);
        System.out.println();
        Collections.sort(array1);
        System.out.println(array1);
        System.out.println();
        int result1 = Collections.binarySearch(array1, 123);
        System.out.println(result1);
        System.out.println();
        Collections.reverse(array1);
        System.out.println(array1);
        System.out.println();
        Collections.shuffle(array1);
        System.out.println(array1);
        int[] a = Arrays.copyOf(array, 3);
        System.out.println(Arrays.toString(a));
        Arrays.spliterator(array);
        System.out.println(Arrays.toString(array));
    }
}
