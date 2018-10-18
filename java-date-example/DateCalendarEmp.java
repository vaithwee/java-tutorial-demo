import java.util.Calendar;

public class DateCalendarEmp {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int day = cal.get(Calendar.DATE);
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int dow = cal.get(Calendar.DAY_OF_WEEK);
        int dom = cal.get(Calendar.DAY_OF_MONTH);
        int doy = cal.get(Calendar.DAY_OF_YEAR);

        System.out.println("current time: " + cal.getTime());
        System.out.println("date: " + day);
        System.out.println("month: " + month);
        System.out.println("year: " + year);
        System.out.println("day of week: " + dow);
        System.out.println("day of month: " + dom);
        System.out.println("day of year: " + doy);
    }
}