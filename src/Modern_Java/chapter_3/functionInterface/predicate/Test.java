package Modern_Java.chapter_3.functionInterface.predicate;

import Modern_Java.chapter_3.Predicate;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        TestInfo info = new TestInfo();
        Predicate<Integer> predicate = i -> i % 2 != 0 && i > 3;

        List<Integer> list1 = info.filter(list, predicate);
        list1.forEach(System.out::println);

    }
}
