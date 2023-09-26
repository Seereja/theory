package weekSeven.task5;

import java.util.Arrays;

public class MyArrayList {
    private int[] arr;
    private int size;
    private int capacity;
    private final static int DEFAULT_CAPACITY = 5;

    public MyArrayList() {
        this.capacity = DEFAULT_CAPACITY;
        this.size = 0;
        this.arr = new int[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.arr = new int[capacity];
    }

    public void add(int elem) {
        if (size >= capacity) {
            capacity = capacity * 2;
            arr = Arrays.copyOf(arr, capacity);
        }
        arr[size] = elem;
        size++;
    }


    public int get(int index) {
        return arr[index];
    }

    public int size() {
        return size;
    }

}
