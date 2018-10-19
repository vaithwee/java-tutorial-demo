import java.io.File;

public class FileExistEmp {
    public static void main(String[] args) {
        File file = new File("/tmp/java.txt");
        System.out.println(file.exists());
    }
}