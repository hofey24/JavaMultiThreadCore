package part4.t16_has_waiters;

/**
 * @author hofey
 **/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();

        Runnable runnable = new Runnable(){
            @Override
            public void run() {
                service.waitMethod();
            }
        };
        Thread[] threadArray = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threadArray[i] = new Thread(runnable);
        }
        for (int i = 0; i < 10; i++) {
            threadArray[i].start();
        }
        Thread.sleep(2000);
        service.notifyMethod();
    }

    
}
