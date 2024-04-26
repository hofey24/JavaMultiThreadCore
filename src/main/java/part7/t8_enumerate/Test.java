package part7.t8_enumerate;

/**
 * @author hofey
 **/
public class Test {
    public static void main(String[] args) {
        //定义一个数组，用来保存所有的线程
        Thread[] threads = new Thread[Thread.activeCount()];
        //将当前线程所在线程组及其子组中每一个活动线程复制到指定的数组中。
        Thread.enumerate(threads);
        for (Thread thread : threads) {
            System.out.println(thread.getName());
        }
    }
}
