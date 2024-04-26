package part7.t10_format_error;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author hofey
 **/
public class MyThread extends Thread{
    private SimpleDateFormat sdf;
    private String dateStr;

    public MyThread(SimpleDateFormat sdf, String dateStr)
    {
        super();
        this.sdf = sdf;
        this.dateStr = dateStr;
    }

    public void run()
    {
        try
        {
            Date dateRef = sdf.parse(dateStr);
            String newDateString = sdf.format(dateRef);
            if(!newDateString.equals(dateStr)){
                System.out.println("ThreadName="+this.getName()+"报错了 日期字符串："+dateStr+" 转换后的字符串："+newDateString);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
