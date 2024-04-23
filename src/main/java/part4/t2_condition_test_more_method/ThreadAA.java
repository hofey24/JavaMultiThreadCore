package part4.t2_condition_test_more_method;

/**
 * @author hofey
 **/
public class ThreadAA extends Thread{
    private MyService service;

    public ThreadAA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.methodA();
    }
}
