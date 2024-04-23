package part4.t9_condition_test_many_to_many;

/**
 * @author hofey
 **/
public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();

        MyThreadA[] threadsA = new MyThreadA[10];
        MyThreadB[] threadsB = new MyThreadB[10];
        for (int i = 0; i < 10; i++) {
            threadsA[i] = new MyThreadA(service);
            threadsB[i] = new MyThreadB(service);
            threadsA[i].start();
            threadsB[i].start();
        }
    }
}
