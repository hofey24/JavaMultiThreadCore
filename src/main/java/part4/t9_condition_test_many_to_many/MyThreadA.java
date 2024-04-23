package part4.t9_condition_test_many_to_many;



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
