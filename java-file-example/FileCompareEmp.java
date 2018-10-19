import java.io.File;

public class FileCompareEmp {
    public static void main(String[] args) {
        File file1 = new File("/tmp/java.txt");
        File file2 = new File("/other/java.txt");
        if (file1.compareTo(file2) == 0) {
            System.out.println("file path is same");
        } else {
            System.out.println("file path is not same");
        }
    }
}