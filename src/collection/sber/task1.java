package collection.sber;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class task1 {
    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        Set<Integer> set1 = new HashSet<>();

        set1.add(1);
        set1.add(3);
        set1.add(11);
        set1.add(113);
        set1.add(4);


        set.retainAll(set1);
        System.out.println(set);


    }
}
