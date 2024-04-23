package part4.t29_read_wirte_lock_begin_1;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author hofey
 **/
public class MyService {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private String username = "abc";

    public void testMethod1(){
        lock.readLock().lock();
        try {
            System.out.println("begin "+Thread.currentThread().getName()+" "+ System.currentTimeMillis());
            System.out.println("print service "+username);
            Thread.sleep(4000);
            System.out.println("end "+Thread.currentThread().getName()+" "+ System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.readLock().unlock();
        }
    }
}
