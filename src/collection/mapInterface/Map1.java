package collection.mapInterface;

import java.util.*;
import java.util.stream.Stream;

public class Map1 {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(112, "Sergey");
        map.put(11, "Nikolay");
        map.put(1, "Nikolay");
        map.put(3, "Petr");
        map.put(4, "Petr");
        map.put(31, "Georgiy");
        map.putIfAbsent(11, "Nicolyi");
        map.putIfAbsent(121, "Nicolyi");

        map.remove(11);
        System.out.println(map.containsKey(22));
        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        System.out.println(map.containsValue("Nicaolyi"));
        System.out.println(map.values().getClass());
        System.out.println(map.keySet().getClass());
        System.out.println(map.keySet());
        System.out.println("MAP IN STREAM");



        List<String> list = new ArrayList<>(map.values());
        List<Integer> list1 = new ArrayList<>(map.keySet());
        List list2 = new ArrayList<>(map.entrySet());
        list.forEach(System.out::println);
        System.out.println();
        list1.forEach(System.out::println);
        System.out.println();
        list2.forEach(System.out::println);
        System.out.println();
        for (Map.Entry<Integer, String> integerStringMap : map.entrySet()) {
            System.out.println(integerStringMap);
        }


    }
}
