package part6.t1_singleton_0;

/**
 * @author hofey
 **/
public class MyObject {
    private static MyObject myObject = new MyObject();

    public static MyObject getInstance()
    {
        return myObject;
    }
}
