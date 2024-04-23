package part4.t1_reentrant_lock_test;

/**
 * @author hofey
 **/
public class MyThread extends Thread{

    private MyService service;

    public MyThread(MyService service)
    {
        super();
        this.service = service;
    }

    @Override
    public void run()
    {
        service.testMethod();
    }
}
