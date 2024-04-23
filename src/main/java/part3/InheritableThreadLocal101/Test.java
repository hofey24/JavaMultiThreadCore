package part3.InheritableThreadLocal101;

/**
 * @author hofey
 **/
public class Test {
    public static void main(String[] args) {
        try {
            if (Tools.tl.get() == null) {
                Tools.tl.set("此值是main线程放入的！");
            }
            System.out.println(" 从 main 线程中取值= " + Tools.tl.get());
            Thread.sleep(100);
            ThreadA a = new ThreadA();
            a.start();
            Thread.sleep(5000);
            Tools.tl.set("此值是main线程新放入的");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
