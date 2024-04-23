package part4.t3_use_condition_wait_notify_error;

/**
 * @author hofey
 **/
public class Test {
    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
    }
}
