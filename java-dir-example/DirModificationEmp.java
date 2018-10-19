import java.io.File;
import java.util.Date;

public class DirModificationEmp {
    public static void main(String[] args) {
        File dir = new File("/tmp/test");
        System.out.println("Last modify date: " + new Date(dir.lastModified()));
    }
}