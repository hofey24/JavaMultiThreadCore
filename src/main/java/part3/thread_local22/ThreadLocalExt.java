package part3.thread_local22;

/**
 * @author hofey
 **/
public class ThreadLocalExt extends ThreadLocal{
    @Override
    protected Object initialValue() {
        return "我是默认值，第一次get不再为null";
    }
}
