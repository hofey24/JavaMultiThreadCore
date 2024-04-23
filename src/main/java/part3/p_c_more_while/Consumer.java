package part3.p_c_more_while;

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
               while(ValueObject.value.equals("")) {
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
