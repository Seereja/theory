package weekSeven.two;

public class Thermometer {

    private double celsius;
    private double fahrenheit;


    public Thermometer(double currentTemperature, TemperatureUnit temperatureUnit) {
        try {
            if (temperatureUnit == TemperatureUnit.CELSIUS) {
                celsius = currentTemperature;
                fahrenheit = fromCelsiustoFahrenheit(currentTemperature);
            } else if (temperatureUnit == TemperatureUnit.FAHRENHEIT) {
                fahrenheit = currentTemperature;
                celsius = fromFahrenheittoCelsius(currentTemperature);
            }
        } catch (RuntimeException e) {
            throw new RuntimeException("Не удалось распознать единицу измерения");
        }
    }

    public double getCelsius() {
        return celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    private double fromCelsiustoFahrenheit(double currentTemperature) {
        return currentTemperature * 1.8 + 32;

    }

    private double fromFahrenheittoCelsius(double currentTemperature) {
        return (currentTemperature - 32) / 1.8;

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
