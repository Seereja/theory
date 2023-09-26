package multithrading.dataRace;

public class ExOne {
    public static void main(String[] args) {


        MyRunnable runnable = new MyRunnable();

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter {
    static int count = 0;
}

class MyRunnable implements Runnable {
    //public static synchronized если метод сделать
// синхронихированным, то выведет
//1 2 3 4 5 6 7 8 9 поскольку сначала будет работать один поток с Main Memory
    void increment() {
        Counter.count++;
        System.out.print(Counter.count + " ");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increment();
        }
    }


}

