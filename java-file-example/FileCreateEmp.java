import java.io.File;
import java.io.IOException;

public class FileCreateEmp {
    public static void main(String[] args) {
        try {
            File file = new File("/tmp/myfile.txt");
            if (file.createNewFile()) {
                System.out.println("file create succeed");
            } else {
                System.out.println("file had existed");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}