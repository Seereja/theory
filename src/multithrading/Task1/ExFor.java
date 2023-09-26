package multithrading.Task1;

public class ExFor implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new ExFor());
        thread.start();

        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}
