package part4.t4_z3_ok;

/**
 * @author hofey
 **/
public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        MyThreadA a1 = new MyThreadA(service);
        a1.start();
        MyThreadA a2 = new MyThreadA(service);
        a2.start();
        MyThreadA a3 = new MyThreadA(service);
        a3.start();
    }
}
