package part3.p_c_all_wait;



/**
 * @author hofey
 **/
public class Run1 {

    public static void main(String[] args) {
        String lock = new String("");
        Producer producer = new Producer(lock);
        Consumer consumer = new Consumer(lock);

        ThreadP[] threadP = new ThreadP[2];
        ThreadC[] threadC = new ThreadC[2];

        for (int i = 0; i < 2; i++) {
            threadP[i] = new ThreadP(producer);
            threadP[i].setName("生产者" + (i+1));

            threadC[i] = new ThreadC(consumer);
            threadC[i].setName("消费者" + (i+1));

            threadP[i].start();
            threadC[i].start();

        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Thread[] threads = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(threads);

        for (int i = 0; i < threads.length; i++) {
            System.out.println(threads[i].getName()+" "+threads[i].getState());
        }
    }
}
