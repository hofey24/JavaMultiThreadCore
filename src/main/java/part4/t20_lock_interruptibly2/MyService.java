package part4.t20_lock_interruptibly2;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author hofey
 **/
public class MyService {
    private ReentrantLock lock = new ReentrantLock();

    public void testMethod() throws InterruptedException {

        lock.lockInterruptibly();
        try {

            System.out.println("begin "+ Thread.currentThread().getName()+ " "+ System.currentTimeMillis());
            for (int i = 0; i < Integer.MAX_VALUE/10 ; i++) {
                    String newString = new String();
                    Math.random();
                    //为了不让currentThread()方法占用cpu资源
                    //执行yield()方法
                Thread.yield();
            }
            System.out.println("end "+ Thread.currentThread().getName()+ " "+ System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
}
