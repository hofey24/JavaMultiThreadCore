package part3.thread_local33;

import java.util.Date;

/**
 * @author hofey
 **/
public class ThreadLocalExt extends ThreadLocal{
    @Override
    protected Object initialValue() {
        return System.currentTimeMillis();
    }
}
