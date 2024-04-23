package part4.t19_is_locked;

/**
 * @author hofey
 **/
public class Run {
    public static void main(String[] args) {

        MyService service = new MyService();
        Runnable runnable = () -> service.serviceMethod();

        Thread thread = new Thread(runnable);
        thread.start();

    }
}
