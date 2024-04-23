package part4.t20_lock_interruptibly2;

/**
 * @author hofey
 **/
public class ThreadA extends Thread{
    private MyService service;
    public ThreadA(MyService service)
    {
        super();
        this.service = service;
    }
    public void run()
    {
        try {
            service.testMethod();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
