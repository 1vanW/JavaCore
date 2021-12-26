package multithreading;

public class VolatileExample extends Thread{

    volatile boolean b = true;

    @Override
    public void run() {
        int counter = 0;
        while (b){
            counter++;
        }
        System.out.println("Loop ends counter = " + counter );
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileExample example = new VolatileExample();
        example.start();

        Thread.sleep(3000);

        System.out.println("After 3 seconds it is time to wake up");

        example.b = false;
        example.join();

        System.out.println("Ends programm");

    }
}
