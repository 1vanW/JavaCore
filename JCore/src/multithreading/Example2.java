package multithreading;

public class Example2 {
    public static void main(String[] args) {
        MyThreadOne myThreadOne = new MyThreadOne();
        MyThreadTwo myThreadTwo = new MyThreadTwo();

        myThreadOne.start();
        myThreadTwo.start();
    }
}

class MyThreadOne extends Thread{

    @Override
    public void run() {
        for (int i = 1; i<=1000; i++){
            System.out.println(i);
        }
    }
}
class MyThreadTwo extends Thread{
    @Override
    public void run() {
        for (int i=1000; i>0;i-- ) {
            System.out.println(i);
        }

    }
}