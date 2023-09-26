package weekSeven.task8;

public class FistCar extends MeansOfTransportation {

    int passengers;

    public FistCar(int age, String name, int passengers) {
        super(age, name);
        this.passengers = passengers;
    }


    @Override
    void ring(String name) {
        System.out.println(name + " дзынь");
    }

    @Override
    public void drive(String name) {
        System.out.println("Она завелась!!" + name);

    }

    @Override
    public void slowDown(String car) {
        System.out.println("Стой стой!!!!" + name);
    }
}
