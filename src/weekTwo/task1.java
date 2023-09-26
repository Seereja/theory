package weekTwo;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String result = n % 2 == 0 ? "число " + n + " четное" : "число " + n + " нечетное";
        System.out.println(result);

    }


}
