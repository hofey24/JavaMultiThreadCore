package part4.t3_use_condition_wait_notify_error;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author hofey
 **/
public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    /**
     * await()方法的作用是 使当前线程在接到通知或被中断之前，一直处于等待状态。它和wait()方法的作用一样。
     */
    public void await(){
        try {
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
