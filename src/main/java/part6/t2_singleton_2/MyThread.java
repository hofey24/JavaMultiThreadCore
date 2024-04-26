package part6.t2_singleton_2;

/**
 * @author hofey
 **/
public class MyThread extends  Thread{
    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}
