package weekSeven.lamp;

public class Testlamp {
    public static void main(String[] args) {

        Lamp lamp = new Lamp();
        System.out.println(lamp.isShinning());
        lamp.turnOn();
        boolean result = lamp.isShinning();
        System.out.println(result);

        Chandelier chandelier=new Chandelier(4);
    }
}
