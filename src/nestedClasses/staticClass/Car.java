package nestedClasses.staticClass;

public class Car {

    private String color;
    private int doorCount;
    private static int a;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        Car.a = a;
    }

    public Engine engine;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    public Car() {

    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }


    public static class Engine {
        static int countOfObjects;
        private int horsePower;

        public Engine(int horsePower) {
            //статический класс может обращаться к статическим полям в обрамляющем классе - даже к privet;
            System.out.println(a);
            countOfObjects++;
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
