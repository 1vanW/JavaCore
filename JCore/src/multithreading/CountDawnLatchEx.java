package multithreading;

import java.util.concurrent.CountDownLatch;

public class CountDawnLatchEx {
    static CountDownLatch countDawnLatch = new CountDownLatch(3);
    private static void marketStaffOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Market staff came to work");
        countDawnLatch.countDown();
        System.out.println(countDawnLatch.getCount());

    }
    private static void everythingIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Everything is ready, so let`s open market");
        countDawnLatch.countDown();
        System.out.println(countDawnLatch.getCount());

    }
    private static void openMarket() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("open is market");
        countDawnLatch.countDown();
        System.out.println(countDawnLatch.getCount());

    }
    public static void main(String[] args) throws InterruptedException {

        Friend friend1 = new Friend("Ivan",countDawnLatch);
        Friend friend2 = new Friend("Anna",countDawnLatch);
        Friend friend3 = new Friend("Maksim",countDawnLatch);
        Friend friend4 = new Friend("Sacha",countDawnLatch);

        marketStaffOnPlace();
        everythingIsReady();
        openMarket();


    }
}

class Friend extends Thread{
    String name;
    private CountDownLatch countDownLatch;

    public Friend(String name, CountDownLatch countDownLatch){
        this.countDownLatch=countDownLatch;
        this.name=name;
        this.start();
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
            System.out.println(name + " приступил к закупкам");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

