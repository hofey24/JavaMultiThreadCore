package part7.t13_thread_create_exception;

/**
 * @author hofey
 **/
public class MyThread extends Thread{
    @Override
    public void run() {
        super.run();

        String username = null;
        System.out.println(username.hashCode());
    }
}
