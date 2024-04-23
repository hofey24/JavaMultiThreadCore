package part4.t27_condition123;

/**
 * @author hofey
 **/
public class Test {
    public static void main(String[] args) {
        MyService service = new MyService();
        for (int i = 0; i < 5; i++) {
            ThreadA a = new ThreadA(service);
            a.setName("A");
            a.start();
            ThreadB b = new ThreadB(service);
            b.setName("B");
            b.start();
            ThreadC c = new ThreadC(service);
            c.setName("C");
            c.start();
        }

    }
}
