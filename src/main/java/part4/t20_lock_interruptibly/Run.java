package part4.t20_lock_interruptibly;

/**
 * @author hofey
 **/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();

        Thread.sleep(500);

        ThreadA b = new ThreadA(service);
        b.setName("B");
        b.start();

        Thread.sleep(500);

        b.interrupt();
        System.out.println(" main 中断 b ,但并没有成功");
    }
}
