package equals;

import java.util.Objects;

public class Animal {
    private int id;


    public Animal(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;

    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
