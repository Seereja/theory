package collection.arrayList;

import java.util.*;

public class Task5 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Паша");
        list.add("Техник");
        list.add("Витя");
        list.add("АКА47");
        list.add("АКА47");

        Collections.reverse(list);
        System.out.println(list);

//        List<?> list1 = List.copyOf(list);
//        System.out.println(list1);

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            if (list.equals("Витя")) {
                iterator.remove();

            }
            System.out.println(iterator.next());
        }

        System.out.println(list);
    }
}
