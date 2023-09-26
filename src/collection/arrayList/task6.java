package collection.arrayList;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class task6 {
    public static void main(String[] args) {
        Set<String> set = Collections.newSetFromMap(new ConcurrentHashMap<>());
        set.add("aaa");
        set.add("bbb");

        for (String s : set) {
            set.add("fff");
            System.out.println(s);
        }
    }
}
