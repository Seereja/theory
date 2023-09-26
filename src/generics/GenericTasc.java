package generics;


import java.util.ArrayList;

public class GenericTasc {
    public static void main(String[] args) {

//        ArrayList<Integer> intArray=new ArrayList<>();
//        intArray.add(2);
//        intArray.add(4);
//        intArray.add(3);
//        ArrayList<Double> doubleArray =new ArrayList<>();
//        doubleArray.add(3.4);
//        doubleArray.add(1.3);
//        doubleArray

        Integer[] intArray = {new Integer(2), new Integer(4),
                new Integer(3)};

        // Создать массив типа Double
        Double[] doubleArray = {new Double(3.4), new Double(1.3),
                new Double(-22.1)};

        // Создать массив типа Character
        Character[] charArray = {new Character('а'),
                new Character('К'), new Character('р')};
        // Создать массив типа String
        String[] stringArray = {"Вера", "Надежда", "Любовь"};

        // Отсортировать массивы
        sort(intArray);
        sort(doubleArray);
        sort(charArray);
        sort(stringArray);

        // Отобразить отсортированные массивы
        System.out.print("Отсортированные объекты типа Integer: ");
        printList(intArray);
        System.out.print("Отсортированные объекты типа Double: ");
        printList(doubleArray);
        System.out.print("Отсортированные объекты типа Character: ");
        printList(charArray);
        System.out.print("Отсортированные объекты типа String: ");
        printList(stringArray);
    }

    private static void printList(Object[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");

        }
    }

    private static <E extends Comparable<E>> void sort(E[] list) {
        E currentMin;
        int currenMinIndex;

        for (int i = 0; i < list.length - 1; i++) {
            currentMin = list[i];
            currenMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin.compareTo(list[j]) > 0) {
                    currentMin = list[j];
                    currenMinIndex = j;
                }
            }
            if (currenMinIndex != i) {
                list[currenMinIndex] = list[i];
                list[i] = currentMin;
            }

        }
    }
}
