package part3.p_c_more_while;

/**
 * @author hofey
 **/
public class Run {

    public static void main(String[] args) {
        String lock = new String("");
        Producer producer = new Producer(lock);
        Consumer consumer = new Consumer(lock);

        ThreadP threadP = new ThreadP(producer);
        ThreadC threadC = new ThreadC(consumer);

        threadP.start();
        threadC.start();
    }
}
