package weekOne;

import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        //в этой задаче мы должны найти ервое число и второе число двузначного числа
        int second = a / 10;
        int first = a % 10;
        System.out.println(first);
        System.out.println(second);
    }
}
