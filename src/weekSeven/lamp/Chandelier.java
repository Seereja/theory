package weekSeven.lamp;

public class Chandelier {

    Lamp[] chandelier;

    public Chandelier(int countOfLamps) {
        if (chandelier != null && chandelier.length > 0) {
            chandelier = new Lamp[countOfLamps];
            for (int i = 0; i < countOfLamps; i++) {
                chandelier[i] = new Lamp();
            }
        }
    }

    public void turnOn() {
        for (Lamp lamp : chandelier) {
            lamp.turnOn();
        }
    }

    public void turnOff() {
        for (Lamp lamp : chandelier) {
            lamp.turnOff();
        }
    }

    public boolean isShinning() {
        return chandelier[0].isShinning();
    }
}
