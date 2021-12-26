package multithreading;

public class SynchronizedBlock {
    public static void main(String[] args) {
        MyRunnable3 myRunnable3 = new MyRunnable3();
        Thread thread1 = new Thread(myRunnable3);
        Thread thread2 = new Thread(myRunnable3);
        Thread thread3 = new Thread(myRunnable3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
class Counter2{
    static int count = 0;
}

class MyRunnable3 implements Runnable{

    private void doWork2(){
        System.out.println("УРа");
    }
    private  void  doWork1(){

        doWork2();
        synchronized(this){
        Counter2.count++;

        System.out.println(Counter2.count);}

    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++){
            doWork1();
        }
    }
}