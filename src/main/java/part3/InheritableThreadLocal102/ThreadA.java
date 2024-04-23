package part3.InheritableThreadLocal102;

/**
 * @author hofey
 **/
public class ThreadA extends Thread{

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("从线程A中取值="+ Tools.tl.get());
                Thread.sleep(1000);
                if (i == 5) {
                    Tools.tl.set("我是ThreadA的newnewnewnewnewnewnewnew最新的值");
                    System.out.println("在ThreadA线程中修改了值=");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
