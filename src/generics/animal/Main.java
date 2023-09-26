package generics.animal;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());

        ArrayList<Pet> pets = new ArrayList<>();
        pets.add(new Pet());
        pets.add(new Pet());


        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        iterateAnimals(animals);
        iterateAnimals(cats);
        iterateAnimals(pets);
        iterateAnimals(dogs);
        iterateAnimalsSuperCat(animals);
        iterateAnimalsSuperCat(cats);
        iterateAnimalsSuperCat(pets);


    }

    private static <T> void iterateAnimalsSuperCat(Collection<? super Cat> animals) {

        for (int i = 0; i < animals.size(); i++) {
            System.out.println("Еще один шаг в цикле пройден!");
        }

    }

    private static <T> void iterateAnimals(Collection<? extends Animal> animals) {

        for (Animal animal : animals) {
            System.out.println(animal + " Еще один шаг в цикле пройден!");
        }
    }
}
