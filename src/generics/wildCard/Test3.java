package generics.wildCard;

import java.util.ArrayList;

public class Test3<T> {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(112);
        list.add(121);
        list.add(11232);

        ArrayList<Double> list1 = new ArrayList<>();
        list1.add(12.2);
        list1.add(112.2);
        list1.add(121.3);
        list1.add(11232.1);

        System.out.println(sum(list));
        System.out.println(sum(list1));

        Test3.sum(list);
        Test3.sum(list1);
    }

    private static double sum(ArrayList<? extends Number> list) {
        double result = 0;
        for (Number d : list) {
            result += d.doubleValue();
        }
        return result;
    }
}
