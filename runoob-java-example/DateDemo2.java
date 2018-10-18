import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo2 {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("now date is " + ft.format(now));
    }
}