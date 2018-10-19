import java.io.File;

public class DirHiddenEmp {
    public static void main(String[] args) {
        File file = new File("/tmp");
        System.out.println(file.isHidden());
    }
}