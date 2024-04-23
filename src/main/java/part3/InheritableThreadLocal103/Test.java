package part3.InheritableThreadLocal103;

/**
 * @author hofey
 **/
public class Test {
    public static void main(String[] args) {
        Userinfo userinfo = new Userinfo();
        System.out.println(" A userinfo " + userinfo.hashCode());
        userinfo.setName("中国");
        if (Tools.tl.get() == null) {
            Tools.tl.set(userinfo);
        }
        Userinfo userinfo1 = (Userinfo) Tools.tl.get();
        System.out.println(" 在Main线程中取值=" + userinfo1.getName() + " " + userinfo1.hashCode());
        try {
            Thread.sleep(100);
            ThreadA a = new ThreadA();
            a.start();
            Thread.sleep(5000);
            userinfo.setName("美国");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
