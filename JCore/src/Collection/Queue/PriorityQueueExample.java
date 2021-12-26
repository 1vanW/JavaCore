package Collection.Queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(4);
        priorityQueue.add(1);
        priorityQueue.add(7);
        priorityQueue.add(10);

        System.out.println(priorityQueue.peek());

        System.out.println(priorityQueue.remove());
    }
}
