package part4.t2_condition_test_more_method;

/**
 * @author hofey
 **/
public class ThreadA extends Thread{
    private MyService service;
    public ThreadA(MyService service) {
        super();
        this.service = service;
    }
    public void run() {
        service.methodA();
    }
}
