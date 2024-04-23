package part3.p_c_test;



/**
 * @author hofey
 **/
public class Producer {
    private String lock;
    public Producer(String lock) {
        this.lock = lock;
    }

    public void setValue() {

        try {
            synchronized (lock) {
                // 如果ValueObject中的value不为空则进入等待
                if(!ValueObject.value.equals("")){
                    lock.wait();
                }
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                System.out.println("set 的值是 "+value);
                ValueObject.value = value;
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
