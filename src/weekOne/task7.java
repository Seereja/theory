package weekOne;

import java.util.Scanner;

public class task7 {
    final static double GALLON_OF_LITTER = 0.26417;
    final static double COST_OF_GALLON_IN_USA = 3.888;
    final static double COST_OF_DOLLAR_IN_RUSSIAN = 89.80;

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        double resultOfGallons = n * GALLON_OF_LITTER;
        System.out.println("в " + n + " литрах " + resultOfGallons + " галлонов");

        double resultOfCostInUSA = resultOfGallons * COST_OF_GALLON_IN_USA;

        System.out.println("стоисомть " + n + " литров в США " + resultOfCostInUSA);

        double rubles = resultOfCostInUSA * COST_OF_DOLLAR_IN_RUSSIAN;
        System.out.println("Стоимость в рублях " + rubles);
    }
}
