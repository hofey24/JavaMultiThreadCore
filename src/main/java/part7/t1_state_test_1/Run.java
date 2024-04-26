package part7.t1_state_test_1;

/**
 * @author hofey
 **/
public class Run {
    public static void main(String[] args) {

        try {
            MyThread t = new MyThread();
            System.out.println("main 方法中的状态1?: "+t.getState());
            Thread.sleep(1000);
            t.start();
            Thread.sleep(1000);
            System.out.println("main 方法中的状态2？ "+t.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
