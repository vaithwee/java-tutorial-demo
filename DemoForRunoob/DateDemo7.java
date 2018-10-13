import java.util.Date;

public class DateDemo7 {
    public static void main(String[] args) {
        try {
            System.out.println(new Date());
            Thread.sleep(1000 * 3);
            System.out.println(new Date());
        } catch (Exception e) {
            System.out.println("Got an exception!");
            //TODO: handle exception
        }
    }
}