package part3.join_test3;

/**
 * @author hofey
 **/
public class Test {
    static int number1 = 0;
    static int number2 = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            number1 = 1000;
        });

        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            number2 = 2000;
        });

        long beginTime = System.currentTimeMillis();

        t1.start();
        t2.start();
        System.out.println("A "+ System.currentTimeMillis());
        t2.join();
        System.out.println("B "+ System.currentTimeMillis());
        t1.join();
        System.out.println("C "+ System.currentTimeMillis());

        long endTime = System.currentTimeMillis();
        System.out.println("number1值为: "+number1+" number2值为: "+number2+",耗时: "+(endTime-beginTime));



    }
}
