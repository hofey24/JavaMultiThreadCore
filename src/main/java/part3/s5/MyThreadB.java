package part3.s5;



/**
 * @author hofey
 **/
public class MyThreadB extends Thread{

    @Override
    public void run() {
        try {
            for (int i = 1; i < 10; i++) {
                if(Tools.tl.get() == null){
                    Tools.tl.set("B "+ (i+1));
                }
                System.out.println("B get " + Tools.tl.get());
                int sleepValue = (int) (Math.random() * 1000);
                Thread.sleep(sleepValue);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
