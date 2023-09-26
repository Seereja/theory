package lambda.sber;

public class TaskOne {
    public static void main(String[] args) {
        MyMathPiInterface piInterface = () -> Math.PI;

        System.out.println(piInterface.getPi());
    }
}
