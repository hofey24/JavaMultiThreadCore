package part4.t28_reentrant_lock_end;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author hofey
 **/
public class MyService {
    private ReentrantLock lock = new ReentrantLock();
    private String username = "abc";

    public void testMethod1(){
        lock.lock();
        try {
            System.out.println("begin "+Thread.currentThread().getName()+" "+ System.currentTimeMillis());
            System.out.println("print service "+username);
            Thread.sleep(4000);
            System.out.println("end "+Thread.currentThread().getName()+" "+ System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
