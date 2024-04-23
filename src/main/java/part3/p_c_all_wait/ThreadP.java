package part3.p_c_all_wait;


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

        }
    }
}
