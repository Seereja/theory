package collection.mapInterface;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Task1 {
    public static void main(String[] args) {

        int[] array = {3, 2, 3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(array, target)));

    }

    private static int[] twoSum(int[] array, int target) {

        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (numToIndex.containsKey(target - array[i])) {
                return new int[]{numToIndex.get(target - array[i]), i};
            }
            numToIndex.put(array[i], i);
        }
        return new int[]{};
    }
}
