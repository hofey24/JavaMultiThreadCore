package part4.t31_read_wirte_lock_begin_3;

/**
 * @author hofey
 **/
public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
        Thread.sleep(1000);
        ThreadB b = new ThreadB(service);
        b.start();
    }
}
