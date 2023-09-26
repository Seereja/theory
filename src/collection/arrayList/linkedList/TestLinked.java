package collection.arrayList.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class TestLinked {
    public static void main(String[] args) {
        LinkedListAlgoritm<String> stringLinked = new LinkedListAlgoritm<>();
        stringLinked.addLast("Alik");
        stringLinked.addLast("Georgy");
        stringLinked.addLast("Mariy");
        stringLinked.addLast("Zeny");
        stringLinked.addLast("Glovich");


//        for (String s : stringLinked) {
//            System.out.println(s);
//        }


        Iterator iterator = stringLinked.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
