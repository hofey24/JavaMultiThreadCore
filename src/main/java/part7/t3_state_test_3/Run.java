package part7.t3_state_test_3;

/**
 * @author hofey
 **/
public class Run {
    public static void main(String[] args) throws InterruptedException {

        MyThread1 t1 = new MyThread1();
        t1.setName("a");
        t1.start();
        Thread.sleep(1000);
        MyThread2 t2 = new MyThread2();
        t2.setName("b");
        t2.start();
        Thread.sleep(1000);
        System.out.println("main 方法 t2 state "+t2.getState());

    }
}
