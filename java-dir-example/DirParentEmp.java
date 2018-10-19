import java.io.File;

public class DirParentEmp {
    public static void main(String[] args) {
        File file = new File("/tmp/test/java.txt");
        String strParentDirectory = file.getParent();
        System.out.println("parent path: " + strParentDirectory);
    }
}