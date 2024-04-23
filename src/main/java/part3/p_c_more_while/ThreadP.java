package part3.p_c_more_while;

/**
 * 线程P
 *
 * @author hofey
 **/
public class ThreadP extends Thread{
    private Producer producer;

    public ThreadP(Producer producer) {
        this.producer = producer;
    }
    public void run() {
        while (true) {
            producer.setValue();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
