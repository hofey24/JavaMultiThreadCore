package part8.t1_concurrent_hash_map;

import java.util.HashMap;

/**
 * @author hofey
 **/
public class MyService {
    public HashMap map  = new HashMap();

    public void testMethod(){
        for (int i = 0; i < 50000; i++) {
            map.put(Thread.currentThread().getName() + " " + (i+1),Thread.currentThread().getName() + " " + (i+1));
            System.out.println(Thread.currentThread().getName() + " " + (i+1));
        }
    }

}
