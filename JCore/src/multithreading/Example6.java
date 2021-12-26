package multithreading;

public class Example6 implements Runnable {
    public static void main(String[] args) {

        Thread thread = new Thread(new Example6());

        thread.run();
        System.out.println("This method main. Thread name = " + Thread.currentThread().getName());

    }

    @Override
    public void run() {
        System.out.println("This method run. Thread name = " + Thread.currentThread().getName());
    }
}
