package part7.t10_format_error;

import java.text.SimpleDateFormat;

/**
 * @author hofey
 **/
public class Run {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String[] dateStr = new String[]{"2016-06-06", "2016-06-07", "2016-06-08", "2016-06-09"};
        MyThread[] threadArray = new MyThread[dateStr.length];
        for (int i = 0; i < dateStr.length; i++) {
            threadArray[i] = new MyThread(format, dateStr[i]);
        }
        for (int i = 0; i < dateStr.length; i++) {
            threadArray[i].start();
        }
    }
}
