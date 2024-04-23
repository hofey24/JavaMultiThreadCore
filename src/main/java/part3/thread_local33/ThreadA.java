package part3.thread_local33;

/**
 * @author hofey
 **/
public class ThreadA extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10; i++) {
            System.out.println("在ThreadA线程中取值="+Tools.tl.get());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
