package Collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {
    public static void main(String[] args) {
        Queue<String>linklist = new LinkedList<>();

        linklist.add("Ivan");
        linklist.add("Anna");
        linklist.add("Maksim");
        linklist.add("Sacha");

        System.out.println(linklist);

        linklist.remove("Maksim");
        System.out.println(linklist);

//        System.out.println(linklist.poll());
//        System.out.println(linklist.element());
//        System.out.println(linklist.poll());
//        System.out.println(linklist.element());
//        System.out.println(linklist.poll());
//        System.out.println(linklist.element());






    }
}
