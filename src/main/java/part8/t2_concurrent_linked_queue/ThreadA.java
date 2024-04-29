package part8.t2_concurrent_linked_queue;

/**
 * @author hofey
 **/
public class ThreadA extends Thread{
    private MyService service;
    public ThreadA(MyService service)
    {
        super();
        this.service = service;
    }
    public void run()
    {
        for (int i = 0; i < 50; i++) {
            service.queue.add("threadA"+(i+1));
        }
    }
}
