package weekOne;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int timeOfWeek = scanner.nextInt();
        int salaryOfHour = scanner.nextInt();
        int tax = scanner.nextInt();

        double resultOfWeek = timeOfWeek * salaryOfHour *(100-tax)/100.0;
        System.out.println(resultOfWeek);
    }
}
