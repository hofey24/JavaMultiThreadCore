package part6.t3_singleton_2_1;

/**
 * @author hofey
 **/
public class MyObject {
    private static MyObject myObject;

    synchronized public static MyObject getInstance() {

        if (myObject == null) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            myObject = new MyObject();
        }
        return myObject;

    }
}
