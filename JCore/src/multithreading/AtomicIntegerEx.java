package multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerEx {
    public  static AtomicInteger counter = new AtomicInteger();

    public synchronized static void increament(){
        counter.incrementAndGet();

    }

    public static void main(String[] args) {
        Thread thread1 = new Thread( new Runner());
        Thread thread2 = new Thread( new Runner());

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counter);

    }
}

class Runner implements Runnable{

    @Override
    public void run() {
        for(int i =0; i < 100; i++){
            AtomicIntegerEx.increament();
        }
    }
}
