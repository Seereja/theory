package exception.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    private static int[] array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 9, 5, 2};

    @Override
    public String toString() {
        return "Array{}";
    }

    private static int[] swap(int[] array, int indexOne, int indexTwo) {
        try {
            int temp = array[indexOne];
            array[indexOne] = array[indexTwo];
            array[indexTwo] = temp;
            return array;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    private static int getIndex(int index) {
        try {
            return array[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    private static int divisionArrayElements(int[] array, int indexOne, int indexTwo) {
        try {
            return array[indexOne] / array[indexTwo];
        } catch (ArithmeticException e) {
            throw new RuntimeException("Вы не можете разделить на ноль " + e.getMessage());
        }
    }


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int indexOne = scanner.nextInt();
        int indexTwo = scanner.nextInt();
        System.out.println(getIndex(indexOne));
        System.out.println();
        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println(divisionArrayElements(array, indexOne, indexTwo));
        System.out.println();
        System.out.println(Arrays.toString(swap(array, indexOne, indexTwo)));
        System.out.println();


    }
}
