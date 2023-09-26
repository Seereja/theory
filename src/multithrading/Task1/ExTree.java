package multithrading.Task1;

public class ExTree {
    public static void main(String[] args) {
        MyThread myThread3=new MyThread();
        MyThread2 myThread4=new MyThread2();

        myThread3.start();
        myThread4.start();
    }
}
