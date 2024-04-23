package part3.thread_local_remove;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author hofey
 **/
public class UserInfo {
    private static AtomicInteger count = new AtomicInteger(0);

    @Override
    protected void finalize() throws Throwable {
        System.out.println("----------------------UserInfo protected void finalize()"+count.addAndGet(1));
    }
}
