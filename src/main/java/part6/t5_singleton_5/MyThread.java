package part6.t5_singleton_5;

/**
 * @author hofey
 **/
public class MyThread extends  Thread{
    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}
