package part4.t1_reentrant_lock_test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author hofey
 **/
public class MyService {

    private Lock lock = new ReentrantLock();

    public void testMethod() {
        lock.lock();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("ThreadName="+Thread.currentThread().getName()+" "+(i+1));
            }
        } finally {
            lock.unlock();
        }
    }
}
