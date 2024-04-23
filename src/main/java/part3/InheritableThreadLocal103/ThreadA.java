package part3.InheritableThreadLocal103;

/**
 * @author hofey
 **/
public class ThreadA extends Thread{
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Userinfo userinfo = (Userinfo) Tools.tl.get();

                System.out.println("在 ThreadA 线程中取值 get Value=" + userinfo.getName() +" "+userinfo.hashCode());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
