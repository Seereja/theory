package weekSix;

import java.util.Scanner;

//Вы проехали 305 км. Из расчета 8 руб. 50 коп. за км,
//стоимость проезда равна 2592 руб. 50 коп.
public class Task5 {
    final static double COST_OF_KILOMETER = 30;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начальные показания одометра: ");
        double startOfOdometer = scanner.nextInt();
        System.out.println("Введите конечные показания одометра: ");
        double endOfOdometer = scanner.nextInt();
        System.out.println(checkOfDistance(startOfOdometer, endOfOdometer));

    }

    private static double checkOfDistance(double startOfOdometer, double endOfOdometer) {
        double distance = endOfOdometer - startOfOdometer;
        double check = 0;

        check = distance * COST_OF_KILOMETER;
        return check;
    }
}
