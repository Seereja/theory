package weekSix;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] count = new int[n];
        int[] elem = new int[n];

        int size = 0;
        for (int i = 0; i < n; i++) {
            count[i] = scanner.nextInt();
            elem[i] = scanner.nextInt();
            size += count[i];
        }
        int k = 0;
        int[] result = new int[size];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < count[i]; j++) {
                result[k++] = elem[i];
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
