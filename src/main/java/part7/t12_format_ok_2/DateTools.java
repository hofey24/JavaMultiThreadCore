package part7.t12_format_ok_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author hofey
 **/
public class DateTools {

    public static String formatStr = "yyyy-MM-dd";

    private static ThreadLocal<SimpleDateFormat> tl = ThreadLocal.withInitial(() -> new SimpleDateFormat(formatStr));
    public static Date parse(String dateStr) throws ParseException {
        return tl.get().parse(dateStr);
    }

    public static String format(Date date) {
        return tl.get().format(date);
    }
}
