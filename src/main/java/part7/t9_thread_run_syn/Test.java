package part7.t9_thread_run_syn;

/**
 * @author hofey
 **/
public class Test {
    public static void main(String[] args) {
        MyService service = new MyService();

        MyThread a = new MyThread(service, "A", 1);
        a.setName("线程1");
        a.start();

        MyThread b = new MyThread(service, "B", 2);
        b.setName("线程2");
        b.start();

        MyThread c = new MyThread(service, "C", 3);
        c.setName("线程3");
        c.start();

    }
}
