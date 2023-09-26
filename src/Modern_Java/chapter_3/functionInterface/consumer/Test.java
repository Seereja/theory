package Modern_Java.chapter_3.functionInterface.consumer;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        TestInfo testInfo = new TestInfo();
        testInfo.forEach(Arrays.asList(1, 2, 3, 4, 5, 6), s -> System.out.println(s));
        System.out.println();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);

        arrayList.forEach(s1 -> {
            System.out.println(s1);
            s1 *= 2;
            System.out.println(s1);
        });
    }
}