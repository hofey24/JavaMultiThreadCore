package part8.t2_concurrent_linked_queue;

/**
 * @author hofey
 **/
public class ThreadB extends Thread{
    private MyService service;
    public ThreadB(MyService service)
    {
        super();
        this.service = service;
    }
    public void run()
    {
        for (int i = 0; i < 50; i++) {
            service.queue.add("threadB"+(i+1));
        }
    }
}
