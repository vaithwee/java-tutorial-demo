import java.util.Date;
import java.util.Locale;

public class DateDemo5 {
    public static void main(String[] args) {
        Date date = new Date();

        String str = String.format(Locale.US, "eng date : %tb", date);
        System.out.println(str);
        System.out.printf("local date: %tb%n", date);

        str = String.format(Locale.US, "eng date: %tB", date);
        System.out.println(str);
        System.out.printf("local date: %tB%n", date);

        str = String.format(Locale.US, "eng date: %ta", date);
        System.out.println(str);
        System.out.printf("local date: %tA%n");

        
    }
}