package part4.t10_fair_nofair_test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author hofey
 **/
public class MyService {
    public Lock lock;

    public MyService(boolean fair){
        lock = new ReentrantLock(fair);
    }

    public void testMethod(){
        lock.lock();
        try {

            System.out.println("testMethod=" + Thread.currentThread().getName());
            //此处的500毫秒用于配合main方法中的500毫秒
            //使"array2---"线程有机会在非公平的情况下抢到锁
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
