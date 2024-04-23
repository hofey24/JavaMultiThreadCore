package part3.stack_1;

/**
 * @author hofey
 **/
public class P_Thread extends Thread{
    private P p;

    public P_Thread(P p) {
        super();
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            p.pushService();
        }
    }
}
