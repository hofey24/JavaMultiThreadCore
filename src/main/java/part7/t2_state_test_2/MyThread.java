package part7.t2_state_test_2;

/**
 * @author hofey
 **/
public class MyThread extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("begin sleep");
            Thread.sleep(10000);
            System.out.println("end sleep");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
