package multithrading.Task2;

public class ExOne {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setName("my_thread");
        myThread.setPriority(Thread.MIN_PRIORITY);
        System.out.println(myThread.getName());
        System.out.println(myThread.getPriority());
        System.out.println();
        MyThread myThread1 = new MyThread();
        System.out.println(myThread1.getName());
        System.out.println(myThread1.getPriority());
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Привет");
    }
}
