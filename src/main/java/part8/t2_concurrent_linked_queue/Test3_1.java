package part8.t2_concurrent_linked_queue;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author hofey
 **/
public class Test3_1 {
    public static void main(String[] args) {
        ConcurrentLinkedQueue queue = new ConcurrentLinkedQueue();
        System.out.println(queue.element());
    }
}
