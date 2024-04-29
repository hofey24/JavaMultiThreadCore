package part9.t3_thread_pool_executor_1;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author hofey
 **/
public class Run1 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(7,8,5, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
        System.out.println(executor.getCorePoolSize());
        System.out.println(executor.getMaximumPoolSize());
        System.out.println();
        executor =new ThreadPoolExecutor(7,8,5, TimeUnit.SECONDS, new SynchronousQueue<>());
        System.out.println(executor.getCorePoolSize());
        System.out.println(executor.getMaximumPoolSize());
    }
}
