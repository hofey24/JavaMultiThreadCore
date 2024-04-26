package part6.t2_singleton_2;

/**
 * @author hofey
 **/
public class MyObject {
    private static MyObject myObject;

    public static MyObject getInstance()
    {
        if (myObject == null)
        {
            return new MyObject();
        }else {
            return myObject;
        }
    }
}
