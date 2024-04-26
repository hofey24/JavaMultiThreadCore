package part6.t10_singleton_10;


/**
 * @author hofey
 **/
public class MyThread extends  Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(MyObject.getConnection().hashCode());
        }

    }
}
