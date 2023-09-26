package weekFour;

import java.util.Scanner;

//Числа Фибоначчи — это последовательность натуральных чисел,
// которая начинается с чисел ноль и один,
// а каждое последующее число равно сумме двух предыдущих:
public class Task9 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();

        int[] array = new int[m];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }


}

