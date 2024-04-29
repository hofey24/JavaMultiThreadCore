package part8.t1_concurrent_hash_map;

/**
 * @author hofey
 **/
public class Thread1A extends Thread{
    private MyService service;

    public Thread1A(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
