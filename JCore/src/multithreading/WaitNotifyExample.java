package multithreading;

public class WaitNotifyExample {
    public static void main(String[] args) {
        Market market = new Market();
        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);

        Thread thread = new Thread(producer);
        Thread thread2 = new Thread(consumer);

        thread.start();
        thread2.start();



    }


}

class Market{
    private int breadCount = 0;

    public synchronized void getBread(){
        while(breadCount < 1){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount--;
        System.out.println("потребитель купил 1 хлеб");
        System.out.println("Количества хлеба в магазине " + breadCount);
        notify();
    }

    public synchronized void putBread(){
        while(breadCount >=5){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount++;
        System.out.println("Производитель добавил хлеб");
        System.out.println("Количества хлеба в магазине " + breadCount );
        notify();
    }


}

class Producer implements Runnable{

    Market market;

    public Producer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i<10; i++){
            market.putBread();
        }
    }
}

class Consumer implements Runnable{
    Market market;

    public Consumer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i<10; i++){
            market.getBread();
        }
    }
}
