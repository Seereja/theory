package weekSeven.task8;

public class TestOfTransport {
    public static void main(String[] args) {


        TheCart carriage = new Carriage(1200, " Военная колесница", 3);
        MeansOfTransportation firstCar = new FistCar(1891, "Первая Машина", 2);
        FistCar ford = new Ford(1920, " Форд крайслер", 4, 50, "Черная");
        MeansOfTransportation transportation = new TheCart(1000, "повозка");
        Ford ford1 = new Ford(1990, " Форд Фокус", 4, 90, "Черная");
        User user = new User("Сергей");
        MeansOfTransportation theCart = new TheCart(10000, "телега");


        firstCar.ring(firstCar.name);
        ford.ring(ford.name);
        ford1.ring(ford1.name);
        System.out.println();

        ford1.showSpeed(ford1.speed);
        System.out.println();
        CarDriver.showColor(ford1.color);

        System.out.println();
        user.userDriver(carriage.name, carriage);
        user.userDriver(firstCar.name, firstCar);
        user.userDriver(ford.name, ford);
        ford1.showCountPassengers(4);
        user.userDriver(transportation.name, transportation);


    }
}
