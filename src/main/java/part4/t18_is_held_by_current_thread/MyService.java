package part4.t18_is_held_by_current_thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author hofey
 **/
public class MyService {
    private ReentrantLock lock = new ReentrantLock();

    public void serviceMethod(){

        System.out.println(lock.isHeldByCurrentThread());
        lock.lock();
        try {
            System.out.println(lock.isHeldByCurrentThread());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
}
