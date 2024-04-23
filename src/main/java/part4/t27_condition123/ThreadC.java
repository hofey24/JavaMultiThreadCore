package part4.t27_condition123;

/**
 * @author hofey
 **/
public class ThreadC extends Thread{
    private MyService service;

    public ThreadC(MyService service)
    {
        super();
        this.service = service;
    }

    public void run()
    {
        service.testMethod3();
    }
}
