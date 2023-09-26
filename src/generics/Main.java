package generics;

public class Main {
    public static void main(String[] args) {


        Info<Double> info1 = new Info<>(3.1);
        System.out.println(info1);

        Info<Integer> info = new Info<>(1);
        System.out.println(info);

    }
}
