package collection.sber;

import java.util.*;

public class Task8 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1233);
        list.add(131133);
        list.add(13);
        list.add(233);
        list.add(233);
        list.add(123312);
        list.add(12);
        list.add(12);
        list.add(133);

        System.out.println(sortAndUnic(list));


    }

    private static Set<Integer> sortAndUnic(List<Integer> list) {

        list.sort(Integer::compareTo);
        return new HashSet<>(list);
    }
}
