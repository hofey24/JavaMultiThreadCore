package part4.t6_must_use_more_condition_error;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author hofey
 **/
public class MyService {
    private Lock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();

    public void awaitA() {
        lock.lock();
        try {
            System.out.println("begin awaitA时间为：" + System.currentTimeMillis());
            condition.await();
            System.out.println("end awaitA时间为：" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void awaitB() {
        lock.lock();
        try {
            System.out.println("begin awaitB时间为：" + System.currentTimeMillis());
            condition.await();
            System.out.println("end awaitB时间为：" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signalAll() {
        lock.lock();
        try {
            System.out.println("signalAll_A时间为：" + System.currentTimeMillis());
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }
}
