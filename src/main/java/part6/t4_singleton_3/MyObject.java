package part6.t4_singleton_3;

/**
 * @author hofey
 **/
public class MyObject {
    private static MyObject myObject;

     public static MyObject getInstance() {

        if (myObject == null) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (MyObject.class) {
                myObject = new MyObject();
            }
        }
        return myObject;

    }
}
