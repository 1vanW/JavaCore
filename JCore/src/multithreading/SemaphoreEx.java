package multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {
    public static void main(String[] args) {
        Semaphore callbox = new Semaphore(2);

        Person person1 = new Person("ivan",callbox);
        Person person2 = new Person("Anna",callbox);
        Person person3 = new Person("Maksim",callbox);
        Person person4 = new Person("Sacha",callbox);

    }
}
class Person extends Thread{
    String name;
    private Semaphore callbox;
    public Person(String name, Semaphore callbox){

        this.name = name;
        this.callbox = callbox;
        this.start();
    }

    @Override
    public void run() {
        System.out.println(name + " ждёт");
        try {
            callbox.acquire();
            System.out.println(name + " пользуется телефоном");
            sleep(2000);
            System.out.println(name + " завершил звонок");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            callbox.release();
        }
    }
}