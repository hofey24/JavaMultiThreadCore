package part3.notify_one;

/**
 * @author hofey
 **/
public class MyService {
    private Object lock = new Object();

    /**
     * 调用该方法，当前线程进入等待状态,并立即释放锁
     */
    public void waitMethod() {
        try {
            synchronized (lock) {
                System.out.println("begin wait() ThreadName=" + Thread.currentThread().getName());
                lock.wait();
                System.out.println("  end wait() ThreadName=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void notifyMethod() {
        synchronized (lock) {
            System.out.println("begin notify() ThreadName=" + Thread.currentThread().getName());
            lock.notify();
            System.out.println("  end notify() ThreadName=" + Thread.currentThread().getName());
        }
    }
}
