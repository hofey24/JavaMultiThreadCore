package part7.t9_thread_run_syn;

/**
 * @author hofey
 **/
public class MyService {

    private ThreadLocal<Integer> printCountLocal = new ThreadLocal<>();

    private static int currentPrintPosition = 0;
    private static int finalPrintPosition = 0;

    synchronized public void printMethod(String eachThreadPrintChar, Integer eachThreadPrintPosition) {
        printCountLocal.set(0);
        //用于判断当前线程的打印次数是否满足要求(使用ThreadLocal为每个线程设置值)
        while (printCountLocal.get() < 3) {
            if (currentPrintPosition == 3) {
                currentPrintPosition = 0;
            }
            //判断当前线程是否需要打印
            //如果当前线程位置和当前线程位置相等，则打印,否则进入等待
            while (eachThreadPrintPosition - 1 != currentPrintPosition) {
                try {
                    //线程A 的打印位置为1，打印过后，当前打印位置+1,经过上面判断，符合条件，进入等待，释放锁，
                    // 这个时候如果线程2抢到了锁，只有线程2的打印位置不符合条件，跳过该while循环，往后执行
                    //如果线程3抢到了锁，线程3的打印位置符合条件，进入等待释放锁
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //最终打印位置+1
            finalPrintPosition++;
            System.out.println(Thread.currentThread().getName() + " " + eachThreadPrintChar + " " + " currentPrintPosition =" + currentPrintPosition + " printCountLocal " + (printCountLocal.get() + 1) + " finalPrintPosition " + finalPrintPosition);
            //当前打印的线程位置发生变化增加1,那么原来的线程位置不符合判断条件，需要等待
            currentPrintPosition++;
            //当前线程打印总数 + 1
            printCountLocal.set(printCountLocal.get() + 1);
            this.notifyAll();
        }
    }
}
