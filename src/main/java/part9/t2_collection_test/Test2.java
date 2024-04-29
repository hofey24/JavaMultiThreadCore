package part9.t2_collection_test;

import java.util.concurrent.SynchronousQueue;

/**
 * @author hofey
 **/
public class Test2 {
    private static SynchronousQueue q = new SynchronousQueue();
    public static void main(String[] args) {
        Thread put = new Thread(){
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 5; i++) {
                        String putString = "我是线程"+Math.random();
                        q.put(putString);
                        System.out.println("putString = " + putString);
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        put.start();
        Thread take = new Thread(){
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 5; i++) {
                        String takeString = (String) q.take();
                        System.out.println("takeString = " + takeString);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        take.start();
    }
}
