package weekSeven.two;

public class TestThermometer {
    public static void main(String[] args) {
        Thermometer thermometer1 = new Thermometer(-25, TemperatureUnit.CELSIUS);
        System.out.println(thermometer1.getCelsius());
        System.out.println(thermometer1.getFahrenheit());
    }
}
