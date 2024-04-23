package part3.notify_all;

/**
 * @author hofey
 **/
public class MyThreadB extends Thread{
    private MyService myService;

    public MyThreadB(MyService myService) {
        this.myService = myService;
    }
    @Override
    public void run() {
        myService.notifyMethod();
    }
}
