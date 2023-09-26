package sorted;

public class SelectSorted {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 4, 10, 43, -2, 15, 4, 5, 3};
        selectSorted(array);
    }

    private static void selectSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int currentMin = array[i];
            int currentMixIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (currentMin > array[j]) {
                    currentMin = array[j];
                    currentMixIndex = j;
                }
            }

            if (currentMixIndex != i) {
                array[currentMixIndex] = array[i];
                array[i] = currentMin;
            }
        }

    }
}
