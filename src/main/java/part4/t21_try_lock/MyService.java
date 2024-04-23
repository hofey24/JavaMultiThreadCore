package part4.t21_try_lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author hofey
 **/
public class MyService {
    public ReentrantLock lock = new ReentrantLock();

    public void testMethod()
    {
        if(lock.tryLock()){
            System.out.println(Thread.currentThread().getName()+"获得锁");

        }else {
            System.out.println(Thread.currentThread().getName()+"没有获取锁");
        }
    }
}
