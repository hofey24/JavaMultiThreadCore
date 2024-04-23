package part4.t2_condition_test_more_method;

/**
 * @author hofey
 **/
public class ThreadB extends Thread{
    private MyService service;

    public ThreadB(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.methodB();
    }
}
