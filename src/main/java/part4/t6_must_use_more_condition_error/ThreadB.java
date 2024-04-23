package part4.t6_must_use_more_condition_error;

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
        service.awaitB();
    }
}
