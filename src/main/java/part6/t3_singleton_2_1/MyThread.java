package part6.t3_singleton_2_1;

/**
 * @author hofey
 **/
public class MyThread extends  Thread{
    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}
