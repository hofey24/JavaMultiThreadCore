package part4.t12_get_queue_length;

/**
 * @author hofey
 **/
public class Run {

    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        Runnable runnable = new Runnable() {
            public void run() {
                service.serviceMethod1();
            }
        };
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(runnable);
        }
        for (int i = 0; i < 10; i++) {
            threads[i].start();
        }
        Thread.sleep(2000);
        System.out.println("有线程数 "+service.lock.getQueueLength()+" 在等待获取锁");
    }
}
