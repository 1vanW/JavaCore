package multithreading;

public class Example7 {
    public static void main(String[] args) {
        for(int i =5; i>0; i--){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Поехали");
    }
}
