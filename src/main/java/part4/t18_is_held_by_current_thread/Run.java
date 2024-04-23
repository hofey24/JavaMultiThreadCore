package part4.t18_is_held_by_current_thread;

/**
 * @author hofey
 **/
public class Run {
    public static void main(String[] args) {

        MyService service = new MyService();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.serviceMethod();
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

    }
}
