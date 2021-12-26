package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    public static void main(String[] args) {

        Call call = new Call();

        Thread thread1 =new Thread(new Runnable() {
            @Override
            public void run() {
                call.mobileCall();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.skypeCall();
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.whatsAppCall();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

    }
}

class Call{
    private Lock lock = new ReentrantLock();

    void mobileCall(){
        lock.lock();
        System.out.println("mobile call starts");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }

        System.out.println("mobile call ends");

    }
    void skypeCall(){
        lock.lock();
        System.out.println("skype call starts");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }

        System.out.println("skype call ends");

    }

    void whatsAppCall(){
        lock.lock();
        System.out.println("whatsApp call starts");
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }

        System.out.println("whatsApp call ends");

    }
}
