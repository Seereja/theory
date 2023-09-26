package generics;

import java.util.ArrayList;

public class ParametrezedClass2 {

    public static void main(String[] args) {

        Pair<String, Integer> pair = new Pair<>("Привет", 20);
        System.out.println("Значение равно " + "value1 = " + pair.getValue() + " value2 = " + pair.getValue2());
    }

}

class Pair<V1, V2> {
    private V1 value;
    private V2 value2;

    public Pair(V1 value, V2 value2) {
        this.value = value;
        this.value2 = value2;

    }

    public V1 getValue() {
        return value;
    }

    public V2 getValue2() {
        return value2;
    }

}

class OtherPair<V> {
    private V value;
    private V value2;

    public OtherPair(V value, V value2) {
        this.value = value;
        this.value2 = value2;

    }

    public V gerValue(V value) {
        return value;
    }

    public V getValue() {
        return value;
    }

    public V getValue2() {
        return value2;
    }

}



