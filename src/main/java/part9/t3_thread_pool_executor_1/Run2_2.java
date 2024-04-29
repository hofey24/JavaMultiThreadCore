package part9.t3_thread_pool_executor_1;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author hofey
 **/
public class Run2_2 {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            try {
                System.out.println(Thread.currentThread().getName()+" run!" + System.currentTimeMillis());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        ThreadPoolExecutor executor = new ThreadPoolExecutor(7,8,5, TimeUnit.SECONDS,new SynchronousQueue<>());
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
        Thread.sleep(300);
        System.out.println("A executor.getCorePoolSize()="+executor.getCorePoolSize());
        System.out.println("A executor.getMaximumPoolSize()="+executor.getMaximumPoolSize());
        System.out.println("A executor.getPoolSize()="+executor.getPoolSize());
        System.out.println("A executor.getQueue().size()="+executor.getQueue().size());
        Thread.sleep(10000);
        System.out.println("10秒后打印结果");
        System.out.println("B executor.getCorePoolSize()="+executor.getCorePoolSize());
        System.out.println("B executor.getMaximumPoolSize()="+executor.getMaximumPoolSize());
        System.out.println("B executor.getPoolSize()="+executor.getPoolSize());
        System.out.println("B executor.getQueue().size()="+executor.getQueue().size());
    }

}
