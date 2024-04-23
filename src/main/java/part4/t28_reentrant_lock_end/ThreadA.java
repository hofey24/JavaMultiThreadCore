package part4.t28_reentrant_lock_end;

/**
 * @author hofey
 **/
public class ThreadA extends Thread{
    private MyService service;

    public ThreadA(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod1();
    }
}
