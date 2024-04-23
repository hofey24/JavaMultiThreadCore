package part3.s5;

/**
 * @author hofey
 **/
public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyThreadA a = new MyThreadA();
        MyThreadB b = new MyThreadB();
        a.start();
        b.start();

        for (int i = 2; i < 10; i++) {
            if (Tools.tl.get() == null) {
                Tools.tl.set("main " + (i + 1));
            }
            System.out.println("main get " + Tools.tl.get());
            int sleepValue = (int) (Math.random() * 1000);
            Thread.sleep(sleepValue);
        }
    }
}
