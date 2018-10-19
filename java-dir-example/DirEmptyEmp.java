import java.io.File;

public class DirEmptyEmp {
    public static void main(String[] args) {
        File file = new File("/tmp/test");
        if (file.isDirectory()) {
            if (file.list().length > 0) {
                System.out.println("dir is not empty");
            } else {
                System.out.println("dir is empty");
            }
        } else {
            System.out.println("this is not dir");
        }
    }
}