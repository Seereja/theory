package collection.sber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task2 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(112);
        arrayList.add(41);
        arrayList.add(4);
        arrayList.add(11);
        arrayList.add(11);
        arrayList.add(11);
        arrayList.add(11);
        System.out.println(count(arrayList, 11));

    }

    public static <T> int count(List<T> from, T value) {
        List<T> list = new ArrayList<>();
        System.out.println(from);
        for (T count : from) {
            if (count.equals(value)) {
                list.add(count);
            }
        }
        System.out.println(list);
        return list.size();
    }


}
