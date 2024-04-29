package part8.t1_concurrent_hash_map;

/**
 * @author hofey
 **/
public class Thread1B extends Thread{
    private MyService service;

    public Thread1B(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
