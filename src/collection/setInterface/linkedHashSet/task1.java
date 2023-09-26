package collection.setInterface.linkedHashSet;

import java.util.LinkedHashSet;

public class task1 {
    public static void main(String[] args) {

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(1);
        linkedHashSet.add(5);
        linkedHashSet.add(53);
        linkedHashSet.add(54);
        linkedHashSet.add(14);
        linkedHashSet.add(111);
        linkedHashSet.add(141);
        linkedHashSet.remove(54);

        System.out.println(linkedHashSet);
    }
}
