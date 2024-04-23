package part4.t30_read_wirte_lock_begin_2;

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
