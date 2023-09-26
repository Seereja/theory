package nestedClasses.inner_class;

public class Car {

    private String color;
    private int doorCount;

    public Engine engine;

    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
        //присвоние новосозданного объекта.
        // текущий объкт this присваивает новосозданнй оъект.
        //в создании объекта inner class всегда задействоан объект внешнего класса
        //как вариант
        //        this.engine = this.new Engine(horsePower);
    }

    //еще один вариант
    // если мы делаем так, то в пользовательском классе мы делаем таким образом
    // сначала создается объект внешнего класса, затем создается объект внутреннего класса
//    Car car1 = new Car("white", 2);
//    Car.Engine engine = car1.new Engine(200);
//        car1.setEngine(engine);
//        System.out.println(car1);
    // или так, но это плохой способ
//    Car.Engine engine1 = new Car("yellow", 4).new Engine(200);
    public void setEngine(Engine engine) {
        this.engine = engine;

    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }


    public class Engine {
        private int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "Engine: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}
