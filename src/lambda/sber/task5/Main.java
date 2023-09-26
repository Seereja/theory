package lambda.sber.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntConsumer;

public class Main {
    public static void main(String[] args) {

        String str = "Мама Мыла Раму";
        String str2 = "mama mama";
        String str3 = "aB12-21ba";
        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome(str2));
        System.out.println(isPalindrome(str3));

    }

    public static boolean isPalindrome(String s) {

        StringBuilder leftToRight = new StringBuilder();

        s.chars()
                .filter(Character::isLetterOrDigit)
                .map(Character::toLowerCase)
                .forEach(leftToRight::appendCodePoint);
        StringBuilder rightToLeft = new StringBuilder(leftToRight).reverse();
        return leftToRight.toString().contentEquals(rightToLeft);
    }
}
