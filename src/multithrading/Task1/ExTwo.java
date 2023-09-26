package multithrading.Task1;

public class ExTwo {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread1());
        Thread thread1 = new Thread(new MyThread4());

        thread.start();
        thread1.start();
    }
}

class MyThread1 implements Runnable {
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            System.out.println(i);
        }
    }
}

class MyThread4 implements Runnable {
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}

