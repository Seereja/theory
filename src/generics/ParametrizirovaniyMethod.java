package generics;

import java.util.ArrayList;

public class ParametrizirovaniyMethod {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(20);
        arrayList.add(30);
        System.out.println(GenMethod.getSecondElement(arrayList));

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Привет");
        arrayList1.add("Пока");
        arrayList1.add("фыв");
        System.out.println(GenMethod.getSecondElement(arrayList1));
    }
}

class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> arrayList) {
        return arrayList.get(1);
    }
}
