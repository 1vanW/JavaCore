package multithreading;

public class DaemonExample {
    public static void main(String[] args) {

        System.out.println("Main thread starts ");
        UserThread userThread = new UserThread();
        userThread.setName("userThread");
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setName("daemonThread");
        daemonThread.setDaemon(true);
        userThread.start();
        daemonThread.start();


        System.out.println("Main thread ends ");
    }
}


class UserThread extends Thread{

    public void run(){
        System.out.println(Thread.currentThread().getName() + " is deamon" + isDaemon());

        for (char i = 'A'; i <='J';i++){
            try {
                Thread.sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class DaemonThread extends Thread{

    public void run(){
        System.out.println(Thread.currentThread().getName() + " is deamon" + isDaemon());

        for (int i = 1; i < 1000;i++){
            try {
                Thread.sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
