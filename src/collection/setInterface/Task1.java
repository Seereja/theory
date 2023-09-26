package collection.setInterface;

import java.util.HashSet;


public class Task1 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(1);
        hashSet.add(3);
        hashSet.add(5);
        hashSet.add(8);
        hashSet.add(2);



        HashSet<Integer> hashSet1 = new HashSet<>();


        hashSet.add(7);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(8);
        hashSet.add(3);

//        HashSet<Integer> union = new HashSet<>(hashSet1);
//        union.addAll(hashSet);
//
//        System.out.println(union);

        HashSet<Integer> intersect = new HashSet<>(hashSet);
        intersect.retainAll(hashSet1);
        System.out.println(intersect);

        HashSet<Integer> subtract = new HashSet<>(hashSet);
        subtract.retainAll(hashSet1);
        System.out.println(subtract);
    }
}
