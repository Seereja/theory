package weekSeven.task6;

public class SmartPhone extends CellPhone {

    private String operationSystem;

    public SmartPhone(int hour, int year, String operationSystem) {
        super(hour, year);
        this.operationSystem = operationSystem;
    }

    public void install(String program) {
        System.out.println("Устанавливаю новую программу " + program + " для " + operationSystem);
    }


    @Override
    public void ring(int inputNumber) {
        System.out.println("Вам звонит абонент " + inputNumber);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("Вызываю номер " + outputNumber);
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "operationSystem='" + operationSystem + '\'' +
                '}';
    }
}
