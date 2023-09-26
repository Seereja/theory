package weekSeven.lamp;

public class Lamp {
    private boolean toggle;


    public Lamp(boolean toggle) {
        this.toggle = toggle;
    }

    public Lamp() {
        this.toggle = false;
    }

    public void turnOn() {
        this.toggle = true;
    }

    public void turnOff() {
        this.toggle = false;
    }

    public boolean isShinning() {
        return this.toggle;
    }
}
