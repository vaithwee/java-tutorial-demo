import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEmp {
    public static void main(String[] args) {
        Date date = new Date();
        String stringDateFormate = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(stringDateFormate);
        System.out.println(sdf.format(date));
    }
}