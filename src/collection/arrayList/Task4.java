package collection.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Паша");
        list.add("Техник");
        list.add("Витя");
        list.add("АКА47");
        list.add("АКА47");

        System.out.println("ArrayList " + list);
        List<String> list1 = list.subList(1, 3);
        System.out.println("SubList " + list1);
        list1.add("Триагрутрика");
        System.out.println("SubList " + list1);
        System.out.println("ArrayList " + list);
        list.add("Пум");
        System.out.println("ArrayList " + list);


        ArrayList<String> list2 = new ArrayList<>();

        list2.add("Коля");
        list2.add("Техник");
        list2.add("Петя");
        list2.add("АКА47");


        Object[] array = list2.toArray();
        String[] array2 = list2.toArray(new String[0]);

        for (String s : array2) {
            System.out.println(s);
        }
    }
}
