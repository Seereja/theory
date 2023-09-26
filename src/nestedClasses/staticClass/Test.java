package nestedClasses.staticClass;

public class Test {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(25);
        Car car1 = new Car("red", 2, engine);
        System.out.println(car1);
        System.out.println(engine);
        Car car = new Car("blue", 3, new Car.Engine(12));
        System.out.println(car);
        Car.Engine engine1 = new Car.Engine(22);

    }
}
