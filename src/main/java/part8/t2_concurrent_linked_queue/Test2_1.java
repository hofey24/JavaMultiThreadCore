package part8.t2_concurrent_linked_queue;

/**
 * @author hofey
 **/
public class Test2_1 {
    public static void main(String[] args) {
        MyService service = new MyService();
        System.out.println(service.queue.poll());
    }
}
