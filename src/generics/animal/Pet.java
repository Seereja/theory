package generics.animal;

public class Pet extends Animal {

    public void call() {
        System.out.println("Pet.call");
    }

    @Override
    public String toString() {
        return "Pet{}";
    }
}
