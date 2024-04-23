package part4.t30_read_wirte_lock_begin_2;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author hofey
 **/
public class MyService {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private String username = "abc";

    public void testMethod1(){
        lock.writeLock().lock();
        try {
            System.out.println("获得写锁" + Thread.currentThread().getName()+ " "+ System.currentTimeMillis());
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.writeLock().unlock();
        }
    }
}
