package lambda.sber.task4;

import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        System.out.println(toFactorial(6));
    }


    public static int toFactorial(int n) {
        return IntStream
                .rangeClosed(1, n)
                .reduce((x, y) -> x * y)
                .getAsInt();
    }
}
