package multithreading;

public class SynchronizedVlock2 {
    static volatile int counter = 0;

    public static synchronized void increament(){
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new Runer2());
        Thread thread2 = new Thread(new Runer2());

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(counter);


    }
}
class Runer2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++){

            Example11.increament();
        }
    }
}

