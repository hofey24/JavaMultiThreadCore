package part6.t1_singleton_0;

/**
 * @author hofey
 **/
public class MyThread extends  Thread{
    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}
