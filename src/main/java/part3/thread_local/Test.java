package part3.thread_local;

/**
 * @author hofey
 **/
public class Test {
    public static void main(String[] args) {
        ThreadLocal local  = new ThreadLocal();
        local.set("我是任意的值");
        System.out.println(local.get());
    }

}
