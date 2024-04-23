package part4.t10_fair_nofair_test;

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
