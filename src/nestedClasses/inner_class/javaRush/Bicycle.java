package nestedClasses.inner_class.javaRush;

public class Bicycle {
    private String model;
    private int weight;

    //переменная объявлена как приват и все равно к ней есть доступ во вложенном классе
    private int seatPostDiameter;
    private String handleBarColor;

    public Bicycle(String model, int weight, int seatPostDiameter, String handleBarColor) {
        this.model = model;
        this.weight = weight;
        this.seatPostDiameter = seatPostDiameter;
        this.handleBarColor = handleBarColor;
    }

    public Bicycle() {

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSeatPostDiameter() {
        return seatPostDiameter;
    }

    public void setSeatPostDiameter(int seatPostDiameter) {
        this.seatPostDiameter = seatPostDiameter;
    }

    public String getHandleBarColor() {
        return handleBarColor;
    }

    public void setHandleBarColor(String handleBarColor) {
        this.handleBarColor = handleBarColor;
    }

    public void start() {
        System.out.println("Поехали!");
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "model='" + model + '\'' +
                ", weight=" + weight +
                ", seatPostDiameter=" + seatPostDiameter +
                '}';
    }

    public class Seat {

        public void up() {
            System.out.println("Сидение поднято выше");
        }

        public void down() {
            System.out.println("Сиденье опущено ниже");
        }

        public void getSeatParam() {
            //у объектов внутреннего класса есть доступ к переменным внешнего класса
            System.out.println("Параметр сиденья: диаметр подселеьного штыря = " + Bicycle.this.seatPostDiameter);
        }
    }

    public class HandleBar {
        public void getHandleBarColor() {
            System.out.println("Цвет руля: " + Bicycle.this.handleBarColor);
        }

        public void right() {
            System.out.println("Руль повернут вправо");
        }

        public void left() {
            System.out.println("Руль повернут влево");
        }

    }

}
