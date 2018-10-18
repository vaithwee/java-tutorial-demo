import java.util.Date;

public class DateDemo3 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.printf("all date and time info: %tc%n", date);
        System.out.printf("y-M-d: %tF%n", date);
        System.out.printf("y/M/d: %tD%n", date);
        System.out.printf("hh:mm:ss: %tr%n", date);
        System.out.printf("HH:mm:ss: %tT%n", date);
        System.out.printf("HH:mm: %tR", date);
    }
}