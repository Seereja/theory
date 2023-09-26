package Tasks;

import java.util.*;

public class toSum {

    //можно так
    //Для случая, когда массив чисел упорядочен, идеально подойдёт подход
    // с двумя указателями. Сначала левый указатель указывает на начало массива,
    // а правый на его конец. Если их сумма равна целевому значению, то мы выходим, если нет, то:
    //
    //если сумма больше целевого значения, то нам нужна меньшая сумма
    // (логично, да?) и мы сдвигаем левее правый указатель
    //если сумма меньше целевого значения, то мы сдвигаем левый указатель, чтобы её увеличить

//    public static int[] methodToSum(int[] array, int result) {
//
//        Arrays.sort(array);
//
//        for (int i = 0; i < array.length - 1; i++) {
//            if (array[i] + array[i + 1] == result)
//
//                return new int[]{i, i + 1};
//        }
//        return null;
//    }

    public static int[] methodToSumHashMap(int[] array, int result) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < array.length - 1; i++) {
            hashMap.put(array[i], i);
        }
        for (int i = 0; i < array.length; i++) {
            int complement = result - array[i];
            if (hashMap.containsKey(complement) && hashMap.get(complement) != i) {
                return new int[]{i, hashMap.get(complement)};
            }
        }


//        for (Map.Entry<Integer, Integer> tree : treeMap.entrySet()) {
//            System.out.println(tree.getKey() + tree.getValue());
//        }

        return array;
    }

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 8, 0, 9};

        int result = 11;
        System.out.println(Arrays.toString(methodToSumHashMap(array, result)));
//        System.out.println(Arrays.toString(methodToSum(array, result)));
    }


}
