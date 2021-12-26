package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExample1 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i =0; i < 10; i++){
            executorService.execute(new RunningImp());
        }
        System.out.println("Main Ends");

    }
}
class RunningImp implements Runnable{

    @Override
    public void run() {

        try {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}