package collection.sber;

import java.util.ArrayList;
import java.util.HashMap;

public class Task7 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("слон");
        arrayList.add("слон");
        arrayList.add("кот");
        arrayList.add("кот");
        arrayList.add("кот");
        arrayList.add("мышь");

        System.out.println(toHashMap(arrayList));
    }

    private static HashMap<String, Integer> toHashMap(ArrayList<String> arrayList) {
        int count = 0;
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String s : arrayList) {
            if (hashMap.containsKey(s)) {
                count = hashMap.get(s);
                count++;
            }
            hashMap.put(s, count);
        }
        return hashMap;
    }
}
