package part3.thread_local_remove;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author hofey
 **/
public class MyThreadLocal extends ThreadLocal{

    private static AtomicInteger count = new AtomicInteger(0);

    @Override
    protected void finalize() throws Throwable {
        System.out.println(" MyThreadLocal finalize()" + count.addAndGet(1));
    }
}
