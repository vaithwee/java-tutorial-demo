import java.io.File;

public class FileReadOnlyEmp {
    public static void main(String[] args) {
        File file = new File("/tmp/java.txt");
        System.out.println(file.setReadOnly());
        System.out.println(file.canWrite());
    }
}