package part3.thread_local_test;

/**
 * @author hofey
 **/
public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyThreadA a = new MyThreadA();
        MyThreadB b = new MyThreadB();
        a.start();
        b.start();

        for (int i = 0; i < 10; i++) {
            Tools.tl.set("main" + (i + 1));
            System.out.println("main get Value=" + Tools.tl.get());
            int sleepValue = (int) (Math.random() * 1000);
            Thread.sleep(sleepValue);
        }
    }
}
