package part3.thread_local_test;

/**
 * @author hofey
 **/
public class MyThreadB extends Thread{
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Tools.tl.set("B " + " " + (i+1));
                System.out.println("B get " + Tools.tl.get());
                int sleepValue = (int) (Math.random() * 1000);
                Thread.sleep(sleepValue);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
