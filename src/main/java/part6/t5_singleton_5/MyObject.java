package part6.t5_singleton_5;

/**
 * @author hofey
 **/
public class MyObject {
    private volatile static MyObject myObject;

     public static MyObject getInstance() {

        if (myObject == null) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (MyObject.class) {
                if (myObject == null) {
                    myObject = new MyObject();
                }
            }
        }
        return myObject;

    }
}
