package part4.t15_has_queued_threads;

/**
 * @author hofey
 **/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();

        Runnable runnable = () -> service.waitMethod();

        Thread threadA = new Thread(runnable);
        threadA.start();

        Thread.sleep(500);

        Thread threadB = new Thread(runnable);
        threadB.start();

        Thread.sleep(500);

        System.out.println(service.lock.hasQueuedThread(threadA));
        System.out.println(service.lock.hasQueuedThread(threadB));
        System.out.println(service.lock.hasQueuedThreads());
    }
}
