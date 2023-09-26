package nestedClasses.inner_class;

public class Test {
    public static void main(String[] args) {

        Car car = new Car("black", 4);
        System.out.println(car);
        Car car1 = new Car("white", 2);
        Car.Engine engine = car1.new Engine(200);
        car1.setEngine(engine);
        System.out.println(car1);
        Car.Engine engine1 = new Car("yellow", 4).new Engine(200);


    }
}
