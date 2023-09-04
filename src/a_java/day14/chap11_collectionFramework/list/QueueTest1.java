package a_java.day14.chap11_collectionFramework.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(100); // enqueue
        queue.offer(200); // enqueue
        queue.offer(300); // enqueue
        System.out.println(queue.poll()); // dequeue
        System.out.println(queue.poll());  // dequeque
        System.out.println(queue.remove()); // dequeque

        queue.clear(); // 초기화

    }
}
