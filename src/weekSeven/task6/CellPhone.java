package weekSeven.task6;

public class CellPhone extends WireLessPhone {
    public CellPhone(int hour, int year) {
        super(hour, year);
    }


    @Override
    public void ring(int inputNumber) {
        System.out.println("Вам звонит абонент " + inputNumber);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("Вызываю номер " + outputNumber);
    }
}
