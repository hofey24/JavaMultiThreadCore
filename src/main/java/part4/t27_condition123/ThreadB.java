package part4.t27_condition123;

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
        service.testMethod2();
    }
}
