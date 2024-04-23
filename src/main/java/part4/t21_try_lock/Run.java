package part4.t21_try_lock;

/**
 * @author hofey
 **/
public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();

        Runnable runnable = () -> service.testMethod();
        Thread threadA = new Thread(runnable);
        threadA.setName("A");
        threadA.start();

        Thread threadB = new Thread(runnable);
        threadB.setName("B");
        threadB.start();
    }
}
