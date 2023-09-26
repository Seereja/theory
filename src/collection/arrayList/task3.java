package collection.arrayList;

import java.util.Arrays;
import java.util.List;

public class task3 {
    public static void main(String[] args) {

        StringBuilder builder1 = new StringBuilder("A");
        StringBuilder builder2 = new StringBuilder("B");
        StringBuilder builder3 = new StringBuilder("C");
        StringBuilder builder4 = new StringBuilder("D");
        StringBuilder builder5 = new StringBuilder("ХУЙ");
        StringBuilder[] array = {builder1, builder2, builder3, builder4};

        List<StringBuilder> list = Arrays.asList(array);
        System.out.println(list);

        array[0].append("!!!!");
        System.out.println(list);
        list.set(0, builder5);
        System.out.println(list);
    }
}
