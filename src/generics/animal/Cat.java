package generics.animal;

public class Cat extends Pet {

    public void meow() {
        System.out.println("Cat.meow()");
    }

    @Override
    public String toString() {
        return "Cat{}";
    }
}
