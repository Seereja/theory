import java.util.Scanner;

public class testOne {
    public static void main(String[] args) {
        Integer a = 10000;
        Integer b = 10000;
        Integer c = 100;
        Integer d = 100;
        int e = 10000;
        int f = 100;

        System.out.printf("%b %b %b %b %b %b", a == e, b == e, a.equals(b), c == f, d == f, c.equals(d));
    }
}