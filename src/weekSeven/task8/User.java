package weekSeven.task8;

public class User {

    String name;

    public User(String name) {
        this.name = name;
    }

    public void userDriver(String car, MeansOfTransportation transportation) {
        transportation.drive(car);
        transportation.slowDown(car);
    }

}
