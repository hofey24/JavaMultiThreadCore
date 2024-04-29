package part9.t2_collection_test;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author hofey
 **/
public class Test4 {
    public static void main(String[] args) {
        ArrayBlockingQueue q = new ArrayBlockingQueue(5);
        q.add("我是线程1");
        q.add("我是线程2");
        q.add("我是线程3");
        q.add("我是线程4");

        System.out.println(q.poll()+" "+q.size());
        System.out.println(q.poll()+" "+q.size());
        System.out.println(q.poll()+" "+q.size());
        System.out.println(q.poll()+" "+q.size());
    }
}
