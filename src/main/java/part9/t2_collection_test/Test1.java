package part9.t2_collection_test;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author hofey
 **/
public class Test1 {
    public static void main(String[] args) {
        LinkedBlockingQueue q = new LinkedBlockingQueue<>();
        q.add("我是线程1");
        q.add("我是线程2");
        q.add("我是线程3");

        System.out.println(q.poll()+" "+q.size());
        System.out.println(q.poll()+" "+q.size());
        System.out.println(q.poll()+" "+q.size());
        System.out.println(q.poll()+" "+q.size());
    }

}
