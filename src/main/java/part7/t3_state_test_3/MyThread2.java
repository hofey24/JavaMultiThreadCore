package part7.t3_state_test_3;

/**
 * @author hofey
 **/
public class MyThread2 extends Thread{
    @Override
    public void run() {
        MyService.serviceMethod();
    }
}
