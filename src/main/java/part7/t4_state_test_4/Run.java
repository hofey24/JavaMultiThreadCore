package part7.t4_state_test_4;

/**
 * @author hofey
 **/
public class Run {
    public static void main(String[] args) {
        try {
            MyThread t = new MyThread();
            t.start();
            Thread.sleep(1000);
            System.out.println("main 方法中的状态： "+ t.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
