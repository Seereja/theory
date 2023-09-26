package multithrading.LockAndReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockAndReentrantLock {
    public static void main(String[] args) {

        Call call = new Call();

        Thread thread1 = new Thread(call::mobileCall);
        Thread thread2 = new Thread(call::skypeCall);
        Thread thread3 = new Thread(call::whatsAppCall);


        thread1.start();
        thread2.start();
        thread3.start();

    }


}

class Call {
    private final Lock lock = new ReentrantLock();

    void mobileCall() {
        lock.lock();
        try {
            System.out.println("Mobile call starts");
            Thread.sleep(3000);
            System.out.println("Mobile call ends");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    void skypeCall() {
        lock.lock();

        try {
            System.out.println("skypeCall call starts");
            Thread.sleep(5000);
            System.out.println("skypeCall call ends");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    void whatsAppCall() {
        lock.lock();

        try {
            System.out.println("whatsAppCall call starts");
            Thread.sleep(7000);
            System.out.println("whatsAppCall call ends");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }
}
