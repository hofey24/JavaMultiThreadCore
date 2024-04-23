package part4.t29_read_wirte_lock_begin_1;

/**
 * @author hofey
 **/
public class Test {
    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
        ThreadA b = new ThreadA(service);
        b.start();
    }
}
