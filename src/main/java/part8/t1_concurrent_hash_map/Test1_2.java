package part8.t1_concurrent_hash_map;

/**
 * @author hofey
 **/
public class Test1_2 {
    public static void main(String[] args) {
        MyService service = new MyService();
        Thread1A a = new Thread1A(service);
        Thread1B b = new Thread1B(service);
        a.start();
        b.start();
    }
}
