package part6.t8_singleton_8;

/**
 * @author hofey
 **/
public class MyObject {
    /**
     * 内部类方式
     */
    private static class MyObjectHolder {
        private static MyObject myObject = new MyObject();
    }
    private MyObject() {
    }

    public static MyObject getInstance(){
        return MyObjectHolder.myObject;
    }
}
