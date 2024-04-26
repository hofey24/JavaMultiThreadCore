package part7.t13_thread_create_exception;

/**
 * @author hofey
 **/
public class Run {
    public static void main(String[] args)
    {
        MyThread t = new MyThread();
        t.start();


        MyThread t2 = new MyThread();
        t2.start();
    }
}
