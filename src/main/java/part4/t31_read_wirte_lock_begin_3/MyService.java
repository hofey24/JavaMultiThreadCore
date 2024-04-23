package part4.t31_read_wirte_lock_begin_3;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author hofey
 **/
public class MyService {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();


    public void read(){
        lock.readLock().lock();
        try {
            System.out.println("获得读锁" + Thread.currentThread().getName()+ " "+ System.currentTimeMillis());
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.readLock().unlock();
        }
    }
    public void write(){
        lock.writeLock().lock();
        try {
            System.out.println("获得写锁" + Thread.currentThread().getName()+ " "+ System.currentTimeMillis());
            Thread.sleep(10000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.writeLock().unlock();
        }
    }
}
