package multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExample2 {

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(1);

//        for (int i=0; i< 10; i++){
////            scheduledExecutorService.execute(new RunningImp2());
////        }

//        scheduledExecutorService.schedule(new RunningImp2(), 3, TimeUnit.SECONDS);

        scheduledExecutorService.scheduleWithFixedDelay(new RunningImp2(),3, 1, TimeUnit.SECONDS);
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        scheduledExecutorService.shutdown();

    }
}
class RunningImp2 implements Runnable{

    @Override
    public void run() {

        try {
            System.out.println(Thread.currentThread().getName() + " Begins work");
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " end work");
    }
}