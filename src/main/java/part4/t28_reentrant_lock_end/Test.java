package part4.t28_reentrant_lock_end;

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
