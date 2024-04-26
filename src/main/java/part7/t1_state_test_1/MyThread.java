package part7.t1_state_test_1;

/**
 * @author hofey
 **/
public class MyThread extends Thread{
    public MyThread(){
        System.out.println("构造方法中的状态 Thread.currentThread().getState() ="+Thread.currentThread().getState());
        System.out.println("构造方法中的状态 this.getState() ="+this.getState());
    }
    public void run()
    {
        System.out.println("run方法中的状态 Thread.currentThread().getState() ="+Thread.currentThread().getState());
    }
}
