import java.io.File;

public class DirCreateEmp {
    public static void main(String[] args) {
        String directories = "/tmp/a/b/c/d/e/f/g/h/i";
        File file = new File(directories);
        boolean result = file.mkdir();
        System.out.println("result = " + result);
    }
}