import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class DateDemo9 {
    public static void main(String[] args) {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int year;

        GregorianCalendar calendar = new GregorianCalendar();
        System.out.print("Date: ");
        System.out.print(" " + calendar.get(Calendar.MONTH));
        System.out.print(" " + calendar.get(Calendar.DATE));
        System.out.print(" " + (year = calendar.get(Calendar.YEAR)));
        System.out.println();

        System.out.print("Time:");
        System.out.print(calendar.get(Calendar.HOUR) + ":");
        System.out.print(calendar.get(Calendar.MINUTE) + ":");
        System.out.print(calendar.get(Calendar.SECOND));


        if (calendar.isLeapYear(year)) {
            System.out.println("current year is leap year");
        } else {
            System.out.println("current year isn't leap year");
        }


    }
}