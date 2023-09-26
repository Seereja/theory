package weekTwo;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rumType = scanner.nextInt();

        switchType(rumType);
    }

    public static int switchType(int rumType) {
        switch (rumType) {
            case 1 -> System.out.println(125);
            case 2 -> System.out.println(110);
            case 3 -> System.out.println(100);
            default -> System.out.println("Такого типа нет");
        }
        return rumType;
    }
}

