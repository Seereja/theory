package equals;

public class TestAnimal {
    public static void main(String[] args) {


        Animal Cat = new Animal(1);
        Animal Dog = new Animal(1);

        System.out.println(Cat.equals(Dog));
        System.out.println(Cat == Dog);
        System.out.println(Cat.hashCode());
        System.out.println(Dog.hashCode());

        int i = Cat.equals(Dog) ? 0 : 1;
        System.out.println(i);

    }
}
