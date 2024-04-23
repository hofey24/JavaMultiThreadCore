package part4.t7_must_use_more_condition_ok;



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
        service.awaitA();
    }
}
