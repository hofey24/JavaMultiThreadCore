package part7.t4_state_test_4;

/**
 * @author hofey
 **/
public class MyThread extends Thread{
    @Override
    public void run() {
        try {
            synchronized (Lock.lock){
                Lock.lock.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
