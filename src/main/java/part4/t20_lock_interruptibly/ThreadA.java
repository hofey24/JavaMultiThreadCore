package part4.t20_lock_interruptibly;

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
        service.testMethod();
    }
}
