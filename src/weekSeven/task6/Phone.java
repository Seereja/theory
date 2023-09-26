package weekSeven.task6;

public class Phone extends AbstractPhone {
    public Phone(int year) {
        super(year);
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Вам звонили " + inputNumber);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("Вы набирали номер " + outputNumber);
    }
}
