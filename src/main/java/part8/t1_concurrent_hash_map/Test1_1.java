package part8.t1_concurrent_hash_map;

/**
 * @author hofey
 **/
public class Test1_1 {
    public static void main(String[] args) {
        MyService service = new MyService();
        Thread1A a = new Thread1A(service);
        a.start();
    }
}
