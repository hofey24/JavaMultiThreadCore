package part3.stack_1;

/**
 * @author hofey
 **/
public class C_Thread extends Thread{
    private C c;
    public C_Thread(C c) {
        this.c = c;
    }
    public void run() {
        while (true) {
            c.popService();
        }
    }
}
