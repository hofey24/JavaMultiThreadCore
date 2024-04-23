package part4.t8_condition_test;

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
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            service.set();
        };
    }
}
