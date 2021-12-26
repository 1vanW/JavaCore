package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ATM {

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();

        Employee employee = new Employee("Zaur",lock);
        Employee employee2 = new Employee("Ivan",lock);
        Employee employe3 = new Employee("Anna",lock);
        Employee employe4 = new Employee("Maksim",lock);
    }

}
class Employee extends Thread{
    String name;

    private Lock lock;

    public Employee(String name, Lock lock){
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {

        try {
            System.out.println(name +  " wait");

            lock.lock();

            System.out.println(name + " использует банкомат");
            Thread.sleep(2000);

            System.out.println(name + " завершил использовать банкомат");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }
}