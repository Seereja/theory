package collection.sber;

import java.util.HashSet;
import java.util.TreeSet;

public class Task3 {
    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(11);
        hashSet.add(2);
        hashSet.add(4);
        hashSet.add(13);
        hashSet.add(42);
        hashSet.add(1);
        System.out.println(hashSet);
        System.out.println(convertHashSet(hashSet));


    }

    public static <T> TreeSet<T> convertHashSet(HashSet<T> from) {
        return new TreeSet<>(from);
    }
    public static <T> TreeSet<T> convertHashSet1(HashSet<T> from) {
        return new TreeSet<>(from);
    }
}
