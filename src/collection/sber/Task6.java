package collection.sber;

import java.util.HashMap;

public class Task6 {
    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("1", 1);
        hashMap.put("2", 213);
        hashMap.put("3", 3);
        hashMap.put("4", 4);
        hashMap.put("5", 5);


        System.out.println(hashMap.get("2"));
    }
}
