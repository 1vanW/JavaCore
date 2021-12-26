package multithreading;

public class Example12 {

    static final Cat cat = new Cat();

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImpMobile());
        Thread thread2 = new Thread(new RunnableImpSkype());
        Thread thread3 = new Thread(new RunnableImpWhatsApp());

        thread1.start();
        thread2.start();
        thread3.start();
    }



    synchronized void mobileCall()  {
        synchronized (cat) {
            System.out.println("сотовый звонок начался");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Сотовой звонок закончился");

        }
    }


    synchronized void skypeCall() {

        synchronized (cat) {
            System.out.println("скайп звонок начался");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Скайп звонок закончился");
        }
    }

    synchronized void whatsAppCall()  {
    synchronized (cat) {
        System.out.println("Ватсап звонок начался");

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ватсап звонок закончился");
    }
    }


}
class RunnableImpMobile implements Runnable{

    @Override
    public void run() {
        new Example12().mobileCall();
    }
}
class RunnableImpSkype implements Runnable{

    @Override
    public void run() {
        new Example12().skypeCall();
    }
}
class RunnableImpWhatsApp implements Runnable{

    @Override
    public void run() {
        new Example12().whatsAppCall();
    }
}
class Cat{}
