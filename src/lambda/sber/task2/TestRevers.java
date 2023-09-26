package lambda.sber.task2;

import java.util.List;
import java.util.ListIterator;

public class TestRevers {

    public static void main(String[] args) {
        ReversString string = str -> {
            String result = " ";
            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };
        System.out.println(string.reversString("Абанамат"));


        ReversString reversString = str -> new StringBuilder(str).reverse().toString();
        System.out.println(reversString.reversString("Абанамат"));

    }
}
