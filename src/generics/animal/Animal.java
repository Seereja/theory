package generics.animal;

public class Animal {
    public void feed() {
        System.out.println("Животное есть");
    }

    @Override
    public String toString() {
        return "Animal{}";
    }
}
