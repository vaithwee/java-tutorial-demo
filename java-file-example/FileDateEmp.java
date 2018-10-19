import java.io.File;
import java.util.Date;

public class FileDateEmp {
    public static void main(String[] args) {
        File file = new File("/tmp/java.txt");
        long lastModified = file.lastModified();
        Date date = new Date(lastModified);
        System.out.println(date);
    }
}