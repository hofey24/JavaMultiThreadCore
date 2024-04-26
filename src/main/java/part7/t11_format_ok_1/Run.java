package part7.t11_format_ok_1;


/**
 * @author hofey
 **/
public class Run {
    public static void main(String[] args) {
        String[] dateStr = new String[]{"2016-06-06", "2016-06-07", "2016-06-08", "2016-06-09"};
       MyThread[] threadArray = new MyThread[dateStr.length];
        for (int i = 0; i < dateStr.length; i++) {
            threadArray[i] = new MyThread( dateStr[i]);
        }
        for (int i = 0; i < dateStr.length; i++) {
            threadArray[i].start();
        }
    }
}
