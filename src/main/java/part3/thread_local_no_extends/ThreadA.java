package part3.thread_local_no_extends;

/**
 * @author hofey
 **/
public class ThreadA extends Thread{

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("从线程A中取值="+Tools.tl.get());
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
