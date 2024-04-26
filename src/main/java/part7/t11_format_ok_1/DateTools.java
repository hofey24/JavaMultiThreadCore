package part7.t11_format_ok_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author hofey
 **/
public class DateTools {

    public static String formatStr = "yyyy-MM-dd";
    public static Date parse(String formatPattern, String dateStr) throws ParseException {
        return new SimpleDateFormat(formatPattern).parse(dateStr);
    }

    public static String format(String formatPattern, Date date) {
        return new SimpleDateFormat(formatPattern).format(date);
    }
}
