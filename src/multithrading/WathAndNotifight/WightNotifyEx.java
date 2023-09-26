package multithrading.WathAndNotifight;

public class WightNotifyEx {

    public static void main(String[] args) {

        Market market = new Market();
        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);
        Thread tr1 = new Thread(producer);
        Thread tr2 = new Thread(consumer);
        tr1.start();
        tr2.start();
    }

}

class Market {
    private int breadCount = 0;

    public synchronized void takeBread() {
        while (breadCount < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        breadCount--;
        System.out.println("потребитель купил один хлеб");
        System.out.println("количество хлеба в магазине " + breadCount);
        notify();
    }

    public synchronized void putBread() {
        while (breadCount >= 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        breadCount++;
        System.out.println("производитель добавил на ветрину 1 хлеб");
        System.out.println("всего хлеба " + breadCount);
        notify();
    }
}

class Producer implements Runnable {

    Market market;

    public Producer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}

class Consumer implements Runnable {
    Market market;

    public Consumer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.takeBread();
        }
    }
}
