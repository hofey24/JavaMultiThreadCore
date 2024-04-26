package part7.t2_state_test_2;

/**
 * @author hofey
 **/
public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();

            Thread.sleep(1000);
            System.out.println("main 方法中的状态： " + myThread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
