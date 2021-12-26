package multithreading;

public class Example10 {

    public static void main(String[] args) {
        MyRunnable2 myRunnable2 = new MyRunnable2();
        Thread thread1 = new Thread(myRunnable2);
        Thread thread2 = new Thread(myRunnable2);
        Thread thread3 = new Thread(myRunnable2);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
class Counter{
      static int count = 0;
}

class MyRunnable2 implements Runnable{
    public synchronized void  increament(){

        Counter.count++;

        System.out.print(Counter.count + " ");

    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++){
            increament();
        }
    }
}
