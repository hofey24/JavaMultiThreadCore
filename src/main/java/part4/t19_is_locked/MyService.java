package part4.t19_is_locked;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author hofey
 **/
public class MyService {
    private ReentrantLock lock = new ReentrantLock();

    public void serviceMethod(){

        System.out.println(lock.isLocked());
        lock.lock();
        try {
            System.out.println(lock.isLocked());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
}
