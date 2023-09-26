package exception.calc;

public class MyIntOverFlowException extends MyBaseException {


    public MyIntOverFlowException(String message) {
        System.out.println(message);

    }

    public MyIntOverFlowException() {
        super("Вы превысили допустимое значение int");
    }
}
