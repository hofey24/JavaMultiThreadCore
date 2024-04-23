package part3.s5;



/**
 * @author hofey
 **/
public class MyThreadA extends Thread{

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                if(Tools.tl.get() == null){
                    Tools.tl.set("A "+ (i+1));
                }
                System.out.println("A get " + Tools.tl.get());
                int sleepValue = (int) (Math.random() * 1000);
                Thread.sleep(sleepValue);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
