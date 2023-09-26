package weekSeven.task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        SmartPhone nokia9211 = new SmartPhone(12, 1992, "nokia3310");
        Scanner scanner = new Scanner(System.in);

        nokia9211.inputNumber = scanner.nextInt();
        nokia9211.outputNumber = scanner.nextInt();
        nokia9211.install("змейка");
        nokia9211.ring(nokia9211.outputNumber);
        nokia9211.call(nokia9211.inputNumber);
        System.out.println();
        System.out.println("Полиморфизм");
        System.out.println();
        AbstractPhone firstPhone = new TomasEdisonPhone(1897);
        AbstractPhone phone = new Phone(1984);
        AbstractPhone videoPhone = new VideoPhone(2018);
        User user = new User("Сергей");

        user.callAnotherUser(2132, phone);
        System.out.println();
        user.callAnotherUser(123123, firstPhone);
        System.out.println();
        user.callAnotherUser(12331, videoPhone);


    }
}
