package part9.t2_collection_test;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author hofey
 **/
public class Test_1 {
    public static void main(String[] args) {
        LinkedBlockingQueue q = new LinkedBlockingQueue<>(2);
        q.add("我是线程1");
        q.add("我是线程2");
        q.add("我是线程3");

    }
}
