package part7.t5_group_add_thread;

/**
 * @author hofey
 **/
public class ThreadA extends Thread{
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println("ThreadName= "+Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
