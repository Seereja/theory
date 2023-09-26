package generics.animal;

public class Dog extends Animal {

    public void gav() {
        System.out.println("Dog.gav()");
    }

    @Override
    public String toString() {
        return "Dog{}";
    }
}
