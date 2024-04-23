package part4.t27_condition123;

/**
 * @author hofey
 **/
public class ThreadA extends Thread{
    private MyService service;

    public ThreadA(MyService service) {
        this.service = service;
    }

    public void run() {
        service.testMethod1();
    }
}
