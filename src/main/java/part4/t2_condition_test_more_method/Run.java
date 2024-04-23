package part4.t2_condition_test_more_method;

/**
 * @author hofey
 **/
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();


        try {
            ThreadA a = new ThreadA(myService);
            a.setName("A");
            a.start();

            ThreadAA aa = new ThreadAA(myService);
            aa.setName("AA");
            aa.start();

            Thread.sleep(100);

            ThreadB b = new ThreadB(myService);
            b.setName("B");
            b.start();

            ThreadBB bb = new ThreadBB(myService);
            bb.setName("BB");
            bb.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
