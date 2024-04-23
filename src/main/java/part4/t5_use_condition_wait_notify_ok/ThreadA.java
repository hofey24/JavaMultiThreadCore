package part4.t5_use_condition_wait_notify_ok;

/**
 * @author hofey
 **/
public class ThreadA extends Thread{
    private MyService service;

    public ThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.await();
    }
}
