package multithrading.volatileEx;

public class VolatileEx extends Thread {
    //хранится в main memory,  а не в кеше потока. если этого не сделать
    // то будет рассинхранизация и переменная не изменится
    // *для синхронизации значения переменной между потоками
    // ключевое слово volatile используется тогда, когда только один поток
    // может изменять значение этой переменной,а остальные потоки могут
    // его только читать
    volatile boolean b = true;

    @Override
    public void run() {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println("loop is finished. counter = " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileEx volatileEx = new VolatileEx();
        volatileEx.start();
        Thread.sleep(3000);
        System.out.println("After 3 seconds it is time to wake up!");
        volatileEx.b = false;
        volatileEx.join();
        System.out.println("End of programm");
    }
}
