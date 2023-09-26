package exception.calc;

public class MyDivisionZeroException extends MyBaseException {

    public MyDivisionZeroException() {
        System.out.println("На ноль делить нельзя");
    }

    public MyDivisionZeroException(String message) {
        super(message);
    }
}
