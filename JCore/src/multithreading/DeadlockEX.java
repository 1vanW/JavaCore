package multithreading;

public class DeadlockEX {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        ThreadMulti threadMulti = new ThreadMulti();
        ThreadMulti20 threadMulti20 = new ThreadMulti20();

        threadMulti.start();
        threadMulti20.start();
    }

}
class ThreadMulti extends Thread{



    @Override
    public void run() {
        System.out.println("ThreadMulti: попытка захватить монитор lock1");
       synchronized (DeadlockEX.lock1){
           System.out.println("ThreadMulti: монитор lock1 захвачен");
           System.out.println("ThreadMulti: попытка захватить монитор lock2");
           synchronized (DeadlockEX.lock2){
               System.out.println("ThreadMulti: монитор lock1 и lock2 захвачены");
           }
       }
    }
}
class ThreadMulti20 extends Thread{



    @Override
    public void run() {
        System.out.println("ThreadMulti20: попытка захватить монитор lock2");
        synchronized (DeadlockEX.lock2){
            System.out.println("ThreadMulti20: монитор lock2 захвачен");
            System.out.println("ThreadMulti20: попытка захватить монитор lock1");
            synchronized (DeadlockEX.lock1){
                System.out.println("ThreadMulti20: монитор lock1 и lock2 захвачены");
            }
        }
    }
}

