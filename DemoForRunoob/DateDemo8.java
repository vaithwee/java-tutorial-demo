import java.util.Date;

public class DateDemo8 {
    public static void main(String[] args) {
        try {
            long start = System.currentTimeMillis();
            System.out.println(new Date());
            Thread.sleep(5 * 60 * 10);
            System.out.println(new Date());
            long end = System.currentTimeMillis();
            long diff = end - start;
            System.out.println("difference is " + diff);
        } catch (Exception e) {
            System.out.println("got an exception");
            //TODO: handle exception
        }
    }
}