package weekSeven.task6;

public class AbstractPhone {

    int year;
    int inputNumber;
    int outputNumber;

    public AbstractPhone(int year) {
        this.year = year;
    }


    public void ring(int inputNumber) {
        System.out.println("Вам звонил " + inputNumber);
    }

    public void call(int outputNumber) {
        System.out.println("Вы звонили " + outputNumber);
    }
}
