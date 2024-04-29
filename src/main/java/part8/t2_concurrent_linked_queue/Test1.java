package part8.t2_concurrent_linked_queue;

/**
 * @author hofey
 **/
public class Test1 {
    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        ThreadB b = new ThreadB(service);
        a.start();
        b.start();
        try {
            a.join();
            b.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(service.queue.size());
    }
}
