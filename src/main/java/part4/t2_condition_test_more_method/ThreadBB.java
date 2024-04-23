package part4.t2_condition_test_more_method;

/**
 * @author hofey
 **/
public class ThreadBB extends Thread{
    private MyService service;

    public ThreadBB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.methodB();
    }
}
