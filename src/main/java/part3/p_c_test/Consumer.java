package part3.p_c_test;

/**
 * @author hofey
 **/
public class Consumer {
    private String lock;

    public Consumer(String lock)
    {
        this.lock = lock;
    }

    public void getValue()
    {
        try
        {
            synchronized (lock) {
               if(ValueObject.value.equals("")) {
                       lock.wait();
               }
               System.out.println("get value = " + ValueObject.value);
               ValueObject.value = "";
               lock.notify();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
