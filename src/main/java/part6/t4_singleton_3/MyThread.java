package part6.t4_singleton_3;

/**
 * @author hofey
 **/
public class MyThread extends  Thread{
    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}
