package exception.calc;

public class MyWrongOperatorException extends MyBaseException {
    public MyWrongOperatorException(String message) {
        super(message);
    }
    public MyWrongOperatorException() {
        System.out.println("Вы ввели неправильные символы оператора");
    }
}
