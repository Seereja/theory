package multithrading.Task1;

public class MyThread2 extends MyThread {
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}
