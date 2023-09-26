package collection.setInterface.treeSet;

import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {

        Set<String> stringSet = new HashSet<>();

        stringSet.add("Сережа");
        stringSet.add("Галя");
        stringSet.add("Пумпарам");
        stringSet.add("Денис");
        stringSet.add("Державин");

        System.out.println(stringSet);

        Set<String> hashSet = new HashSet<>();

        hashSet.add("Сережа");
        hashSet.add("Галя");
        hashSet.add("Пумпарам");
        hashSet.add("Денис");
        hashSet.add("Абриковсов");
        hashSet.add("Петя");
        hashSet.add("Дружба");
        System.out.println(hashSet);


        stringSet.addAll(hashSet);

        System.out.println(stringSet);
    }
}
