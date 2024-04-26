package part6.t6_dcl_and_volatile;

import java.util.concurrent.CountDownLatch;

/**
 * @author hofey
 **/
public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        for(;;){
            CountDownLatch latch = new CountDownLatch(1);
            CountDownLatch end = new CountDownLatch(100);
            for(int i=0;i<100;i++){
                new Thread(()->{
                    try {
                        latch.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    OneInstanceService one = OneInstanceService.getTest1();
                    if(one.iAmHasState == 0){
                        System.out.println(" one.iAmHasState == 0 进程结束");
                        System.exit(0);
                    }
                    end.countDown();
                }).start();
            }
            latch.countDown();
            end.await();
            OneInstanceService.reset();
        }
    }
}
