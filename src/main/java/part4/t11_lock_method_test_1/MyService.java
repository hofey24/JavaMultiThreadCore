package part4.t11_lock_method_test_1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author hofey
 **/
public class MyService {
    private ReentrantLock lock = new ReentrantLock(true);

    public void testMethod1(){
        System.out.println("A "+lock.getHoldCount());
        lock.lock();
        try {
            System.out.println("B "+lock.getHoldCount());
            testMethod2();
            System.out.println("F "+lock.getHoldCount());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        System.out.println("G "+lock.getHoldCount());
    }

    public void testMethod2(){

        System.out.println("C "+lock.getHoldCount());
        lock.lock();
        try {
            System.out.println("D "+lock.getHoldCount());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

        System.out.println("E "+lock.getHoldCount());
    }
}
