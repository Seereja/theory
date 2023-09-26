package nestedClasses.inner_class.javaRush;

public class Test {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.setModel("Аист");
        bicycle.setWeight(12);
        bicycle.setHandleBarColor("Черный");
        bicycle.setSeatPostDiameter(10);
        Bicycle.HandleBar handleBar = bicycle.new HandleBar();
        Bicycle.Seat seat = bicycle.new Seat();
        System.out.println(bicycle);
        seat.getSeatParam();
        seat.up();
        handleBar.getHandleBarColor();
        handleBar.left();
        handleBar.right();


    }
}
