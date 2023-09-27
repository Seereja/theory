package multithrading.interraption;

public class InterruptionEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main starts");
        InterruptionThread interruptionThread = new InterruptionThread();
        interruptionThread.start();
        Thread.sleep(2000);
        //поток мейн хочет прервать
        interruptionThread.interrupt();


        interruptionThread.join();
        System.out.println("main ends");
    }
}

class InterruptionThread extends Thread {
    @Override
    public void run() {
        double sqrtSum = 0;

        for (int i = 0; i < 1000000000; i++) {
            if (interrupted()) {
                System.out.println("Поток хотят прервать");
                System.out.println(sqrtSum);

                return;
            }
            sqrtSum += Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("завершаем во время сна");
                System.out.println(sqrtSum);

                return;
            }
        }
        System.out.println(sqrtSum);
    }
}
