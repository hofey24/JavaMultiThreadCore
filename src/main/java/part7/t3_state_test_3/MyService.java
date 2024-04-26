package part7.t3_state_test_3;

/**
 * @author hofey
 **/
public class MyService {
    synchronized static public void serviceMethod(){

        try {
            System.out.println(Thread.currentThread().getName()+ " 进入业务方法！");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
