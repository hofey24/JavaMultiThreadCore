package part4.t10_fair_nofair_test;

/**
 * @author hofey
 **/
public class Test1_2 {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService(false);

        MyThread[] array1 = new MyThread[10];
        MyThread[] array2 = new MyThread[10];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = new MyThread(service);
            array1[i].setName("array1+++"+(i+1));
        }
        for (int i = 0; i < array1.length; i++) {
            array1[i].start();
        }

        for (int i = 0; i < array2.length; i++) {
            array2[i] = new MyThread(service);
            array2[i].setName("array2---"+(i+1));
        }


        for (int i = 0; i < array2.length; i++) {
            array2[i].start();
        }
    }
}
