package clone;

public class Fett implements Cloneable {

    private String gan;
    Mandalorean mandalorean;

    public String getGan() {
        return gan;
    }

    public void setGan(String gan) {
        this.gan = gan;
    }

    @Override
    protected Fett clone() throws CloneNotSupportedException {
        Fett django = (Fett) super.clone();
        django.mandalorean = mandalorean.clone();
        return django;

    }
}
