package part4.t32_read_wirte_lock_begin_4;

/**
 * @author hofey
 **/
public class ThreadB extends Thread{
    private MyService service;

    public ThreadB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.write();
    }
}
