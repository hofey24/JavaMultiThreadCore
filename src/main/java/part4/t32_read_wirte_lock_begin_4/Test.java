package part4.t32_read_wirte_lock_begin_4;

/**
 * @author hofey
 **/
public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();


        ThreadB b = new ThreadB(service);
        b.start();
        Thread.sleep(1000);
        ThreadA a = new ThreadA(service);
        a.start();
    }
}
