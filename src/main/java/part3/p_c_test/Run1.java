package part3.p_c_test;

/**
 * @author hofey
 **/
public class Run1 {

    public static void main(String[] args) {
        String lock = new String("");
        Producer producer = new Producer(lock);
        Consumer consumer = new Consumer(lock);

        ThreadP[] threadP = new ThreadP[20];
        ThreadC[] threadC = new ThreadC[20];

        for (int i = 0; i < 20; i++) {
            threadP[i] = new ThreadP(producer);
            threadP[i].setName("生产者" + (i+1));
            threadP[i].start();
        }
        for (int i = 0; i < 2; i++) {
            threadC[i] = new ThreadC(consumer);
            threadC[i].setName("消费者" + (i+1));
            threadC[i].start();
        }
    }
}
