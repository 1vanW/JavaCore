package multithreading;

public class Example3 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread1());
        Thread thread2 = new Thread(new ThreadMulti());
        thread.start();
        thread2.start();

    }

}
class MyThread1 implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i<=1000; i++){
            System.out.println(i);
        }
    }
}

class MyThread2 implements Runnable{

    @Override
    public void run() {
        for (int i=1000; i>0;i-- ) {
            System.out.println(i);
        }
    }
}