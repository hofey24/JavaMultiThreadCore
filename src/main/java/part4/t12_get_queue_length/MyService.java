package part4.t12_get_queue_length;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author hofey
 **/
public class MyService {
    public ReentrantLock lock = new ReentrantLock();

    public void serviceMethod1(){
        lock.lock();

        try {
            System.out.println("ThreadName=" +Thread.currentThread().getName() + "进入方法");
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
