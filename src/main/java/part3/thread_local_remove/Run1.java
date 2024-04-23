package part3.thread_local_remove;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hofey
 **/
public class Run1 {
    public static void main(String[] args) {
        for (int i = 0; i < 9000; i++) {
            MyThreadLocal threadLocal  = new MyThreadLocal();
            UserInfo userInfo = new UserInfo();
            threadLocal.set(userInfo);
            threadLocal.remove();
        }
        MyThreadLocal threadLocal = new MyThreadLocal();
        System.out.println("9000 end!");
        List list  = new ArrayList();
        for (int i = 0; i < 900000000; i++) {
            String newString = new String(""+(i+1));
            Thread.yield();
            Thread.yield();
            Thread.yield();
            Thread.yield();
        }
        System.out.println("zzzzzzzzzzz "+threadLocal);
    }
}
