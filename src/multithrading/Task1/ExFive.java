package multithrading.Task1;

public class ExFive {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Привет");
            }
        }).start();

        new Thread(() -> System.out.println("привет")).start();
    }
}