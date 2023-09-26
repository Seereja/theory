package weekSeven.task8;

public class Ford extends FistCar implements CarDriver {

    int speed;
    String color;

    public Ford(int age, String name, int passengers, int speed, String color) {
        super(age, name, passengers);
        this.speed = speed;
        this.color = color;
    }

    public void showCountPassengers(int passengers) {
        System.out.println("Количество пассажиров " + passengers);
    }

    @Override
    public void drive(String name) {
        System.out.println("отлично завелась" + name);
    }

    @Override
    public void slowDown(String name) {
        System.out.println("Отлично затормозила" + name);
    }

    @Override
    public void showSpeed(int speed) {
        System.out.println( " скорость " + name + " " + speed);

    }
}
