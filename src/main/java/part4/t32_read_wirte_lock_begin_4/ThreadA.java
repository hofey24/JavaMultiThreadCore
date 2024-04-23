package part4.t32_read_wirte_lock_begin_4;

/**
 * @author hofey
 **/
public class ThreadA extends Thread{
    private MyService service;

    public ThreadA(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.read();
    }
}
