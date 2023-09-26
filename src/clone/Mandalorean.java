package clone;

public class Mandalorean implements Cloneable {

    private String chest;
     int i;

    public void setChest(String chest) {
        this.chest = chest;
    }

    public String getChest() {
        return chest;
    }



    @Override
    protected Mandalorean clone() throws CloneNotSupportedException {
        return (Mandalorean) super.clone();
    }


}
