package part6.t7_singleton_7;

/**
 * @author hofey
 **/
public class MyObject {
    /**
     * 内部类方式
     */
    private static MyObject instance = null;

    private MyObject() {
    }

    static {
        instance = new MyObject();
    }

    public static MyObject getInstance() {
        return instance;
    }
}
