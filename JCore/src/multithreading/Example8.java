package multithreading;

public class Example8 extends Thread{
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable1());
        Example8 thread2 = new Example8();

        thread1.start();

        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Конец");



    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyRunnable1 implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
