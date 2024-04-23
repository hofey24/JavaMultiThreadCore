package part3.InheritableThreadLocal2;



/**
 * @author hofey
 **/
public class InheritableThreadLocalExt extends InheritableThreadLocal{

    @Override
    protected Object initialValue() {
        return System.currentTimeMillis();
    }
    @Override
    protected Object childValue(Object parentValue) {
        return parentValue + "，我在子线程加的~!";
    }
}
