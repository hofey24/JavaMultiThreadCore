package part3.p_c_all_wait;



/**
 * 消费者线程
 *
 * @author hofey
 **/
public class ThreadC extends Thread{
    private Consumer consumer;

    public ThreadC(Consumer consumer) {
        this.consumer = consumer;
    }

    @Override
    public void run() {
        while (true) {
            consumer.getValue();
        }
    }
}
