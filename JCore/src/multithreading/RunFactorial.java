package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RunFactorial {
    static int factorialResult = 0;
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial factorial = new Factorial(6);


        try {
            executorService.execute(factorial);
            executorService.shutdown();
            executorService.awaitTermination(10, TimeUnit.SECONDS);
            System.out.println(factorialResult);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
class Factorial implements Runnable{
        int f;

        public Factorial(int f){
            this.f = f;
        }

    @Override
    public void run() {
        if(f<=0){
            System.out.println("Вы ввели неверное число");
            return;
        }
            int result = 1;

        for (int i = 1; i <=f; i++ ){
            result*=i;
        }
        RunFactorial.factorialResult =result;
    }
}