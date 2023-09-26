package multithrading.LockAndReentrantLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ATM {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();

        Employee employee = new Employee("Sergey", lock);
        Employee employee1 = new Employee("Oleg", lock);
        Employee employee2 = new Employee("Kirill", lock);
        Employee employee3 = new Employee("Zaur", lock);

        employee.start();
        employee1.start();
        employee2.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        employee3.start();

    }
}

class Employee extends Thread {
    String name;
    private final Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            if (lock.tryLock()) {
                try {
                    System.out.println(name + " ждет...");
                    //            lock.lock();
                    System.out.println(name + " пользуется банкоматом");
                    Thread.sleep(2000);
                    System.out.println(name + " завершил использование банкомата");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println(name + " не хочет ждать в очереди");
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}

