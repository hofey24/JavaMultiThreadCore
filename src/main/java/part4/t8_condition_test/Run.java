package part4.t8_condition_test;

/**
 * @author hofey
 **/
public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();

        MyThreadA a = new MyThreadA(service);
        a.start();

        MyThreadB b = new MyThreadB(service);
        b.start();
    }
}
