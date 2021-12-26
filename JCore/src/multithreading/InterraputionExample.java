package multithreading;

public class InterraputionExample {
    public static void main(String[] args) {

        System.out.println("Main starts");
        InterruptedThread interruptedThread = new InterruptedThread();
        interruptedThread.start();

        try {
            Thread.sleep(200);
            interruptedThread.interrupt();
            interruptedThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main ends");

    }
}

class InterruptedThread extends Thread{
    @Override
    public void run() {

        double sqrtSum = 0;

        for (int i = 1; i < 1000000000; i++){
            if(isInterrupted()){
                System.out.println("threads wants interrupt");
                return;
            }
            sqrtSum += Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Бля мой поток прерывают во время сна завершаюсь всё пока ");
                System.out.println(sqrtSum);
                return;
            }
        }
        System.out.println(sqrtSum);
    }
}
