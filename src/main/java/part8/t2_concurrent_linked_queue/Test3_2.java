package part8.t2_concurrent_linked_queue;

/**
 * @author hofey
 **/
public class Test3_2 {
    public static void main(String[] args) {
        MyService service = new MyService();
        service.queue.add("a");
        service.queue.add("b");
        service.queue.add("c");
        System.out.println("begin size= "+service.queue.size());
        System.out.println(service.queue.element());
        System.out.println("end  size= "+service.queue.size());
    }
}
