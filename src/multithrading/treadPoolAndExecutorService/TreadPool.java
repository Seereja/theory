package multithrading.treadPoolAndExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            executorService.execute(new RunnableImplement100());
        }
        System.out.println("main ends");
    }
}

class RunnableImplement100 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}