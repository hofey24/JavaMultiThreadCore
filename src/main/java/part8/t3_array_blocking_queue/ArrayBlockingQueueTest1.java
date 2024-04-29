package part8.t3_array_blocking_queue;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author hofey
 **/
public class ArrayBlockingQueueTest1 {
    public static void main(String[] args) {
        try {
            ArrayBlockingQueue queue = new ArrayBlockingQueue(3);
            queue.put("a1");
            queue.put("a2");
            queue.put("a3");
            System.out.println(queue.size());
            System.out.println(System.currentTimeMillis());
            queue.put("a4");
            System.out.println(System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
