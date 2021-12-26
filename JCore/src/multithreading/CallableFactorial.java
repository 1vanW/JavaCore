package multithreading;

import java.util.concurrent.*;

public class CallableFactorial {
    static int factorialRes;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factroial2 factroial2 = new Factroial2(6);

        Future<Integer> futer = executorService.submit(factroial2);
        try {
            factorialRes =futer.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        }
        finally {
            executorService.shutdown();
        }
        System.out.println(factorialRes);

    }


}

class Factroial2 implements Callable<Integer>{
    int f;

    public Factroial2(int f){
        this.f =f;
    }
    @Override
    public Integer call() throws Exception {
        if (f <= 0){
            throw new Exception("Какого хуя");
        }
        int result = 1;
        for (int i=1; i <=f; i++){
            result*=i;
        }
        return  result;
    }
}

