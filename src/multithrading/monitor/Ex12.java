package multithrading.monitor;

public class Ex12 {
    //используем для синхронизации
    static final Object lock = new Object();

    //synchronized void mobileCall() если сделать такие методы,
    // то дефолтно будет синхранизация на объекте this
    void mobileCall() {
        //синхронизация по блоку
        synchronized (lock) {

            System.out.println("mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("mobile call ends");
        }
    }

    void skypeCall() {
        synchronized (lock) {
            System.out.println("skype call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("skype call ends");
        }
    }

    void whatsAppCall() {
        synchronized (lock) {
            System.out.println("whatsApp call starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("whatsApp call ends");
        }
    }

    public static void main(String[] args) {

        Thread thread1 = new Thread(new RunnableMobile());
        Thread thread2 = new Thread(new RunnableSkype());
        Thread thread3 = new Thread(new RunnableWatsApp());
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class RunnableMobile implements Runnable {

    @Override
    public void run() {
        new Ex12().mobileCall();
    }
}

class RunnableSkype implements Runnable {

    @Override
    public void run() {
        new Ex12().skypeCall();
    }
}

class RunnableWatsApp implements Runnable {

    @Override
    public void run() {
        new Ex12().whatsAppCall();
    }
}

