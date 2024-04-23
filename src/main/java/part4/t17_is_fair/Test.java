package part4.t17_is_fair;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author hofey
 **/
public class Test {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock(true);
        System.out.println(lock.isFair());
        ReentrantLock lock2 = new ReentrantLock(false);
        System.out.println(lock2.isFair());
        ReentrantLock lock3 = new ReentrantLock();
        System.out.println(lock3.isFair());
    }
}
