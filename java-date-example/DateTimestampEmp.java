import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimestampEmp {
    public static void main(String[] args) {
        Long timeStamp = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat();
        String sd = sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
        System.out.println("format result:" + sd);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        String sd2 = sdf2.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
        System.out.println("format result:" + sd2);
    }
}