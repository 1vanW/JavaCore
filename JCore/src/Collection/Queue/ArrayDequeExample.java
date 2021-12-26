package Collection.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(3);
        deque.addFirst(5);
        deque.addLast(1);
        deque.offerLast(2);
        deque.offerFirst(7);

        System.out.println(deque);

        System.out.println(deque.removeLast());
        System.out.println(deque);
        System.out.println(deque.pollFirst());
        System.out.println(deque);


    }
}
