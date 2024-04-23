package part4.t4_z3_ok;

/**
 * @author hofey
 **/
public class MyThreadA extends Thread{
    private MyService service;

    public MyThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.waitMethod();
    }
}
