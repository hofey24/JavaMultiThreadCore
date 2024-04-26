package part7.t12_format_ok_2;

import java.util.Date;

/**
 * @author hofey
 **/
public class MyThread extends Thread{
    private String dateStr;

    public MyThread( String dateStr)
    {
        super();
        this.dateStr = dateStr;
    }

    public void run()
    {
        try
        {
            Date dateRef = DateTools.parse(dateStr);
            String newDateString = DateTools.format(dateRef);
            if(!newDateString.equals(dateStr)){
                System.out.println("ThreadName="+this.getName()+"报错了 日期字符串："+dateStr+" 转换后的字符串："+newDateString);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
