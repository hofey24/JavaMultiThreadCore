package part3.notify_one;

/**
 * @author hofey
 **/
public class MyThreadA extends Thread{
    private MyService myService;
    public MyThreadA(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.waitMethod();
    }
}
