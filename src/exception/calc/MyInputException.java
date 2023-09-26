package exception.calc;

import java.util.InputMismatchException;

public class MyInputException extends MyBaseException {

    public MyInputException(String message) {
        super(message);
    }

    public MyInputException() {
        super("неправильные символы для вода");
    }
}
