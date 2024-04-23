package part3.notify_all;

/**
 * @author hofey
 **/
public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();

        for (int i = 0; i < 10; i++) {
            MyThreadA t1 = new MyThreadA(service);
            t1.start();
        }

        Thread.sleep(1000);

        MyThreadB t1 = new MyThreadB(service);
        t1.start();

        Thread.sleep(500);
    }
}
