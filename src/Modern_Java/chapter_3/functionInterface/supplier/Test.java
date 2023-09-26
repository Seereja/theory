package Modern_Java.chapter_3.functionInterface.supplier;

import Modern_Java.chapter_3.functionInterface.function.Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

import static java.lang.Math.random;

public class Test {

    public static ArrayList<Car> carArrayList(Supplier<Car> carSupplier) {
        ArrayList<Car> arrayList = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            arrayList.add(carSupplier.get());
        }
        return arrayList;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = carArrayList(() ->
                new Car("Toyota Rav4", "White", 2.0));
        System.out.println("Вывод Supplier");

        System.out.println(ourCars);
        System.out.println();
        System.out.println("Вывод Consumer");
        changeCar(ourCars.get(0), car -> {
            car.setColor("Red");
            car.setEngine(3.0);
        });


        System.out.println(ourCars);

        ArrayList<String> prediction = new ArrayList<>();
        prediction.add("Все будет хорошо");
        prediction.add("Все будет лучше");
        prediction.add("Все будет еще лучше");

        Supplier<String> stringSupplier = () -> {
            int value = (int) (random() * prediction.size());
            return prediction.get(value);
        };
        System.out.println(stringSupplier.get());
        System.out.println();
        Supplier<Car> aNew = Car::new;
        Car myCar = aNew.get();
        System.out.println();
        Function<String, Car> myTwoCar = (color) -> new Car();
        Car myTwoCar2 = myTwoCar.apply("White");


        List<String> color = Arrays.asList("White", "Black", "Blue");
        List<Car> cars = TestInfo.map(color, Car::new);
        System.out.println(cars);

        BiFunction<String, Integer, Car> c3 = Car::new;
        Car a3 = c3.apply("White", 110);

        BiFunction<String, Integer, Car> c4 = (colore, model) -> new Car(colore, model);




    }
}
