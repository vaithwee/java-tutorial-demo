import java.io.File;

public class DirSearchEmp {
    public static void main(String[] args) throws Exception {
        File dir = new File("/tmp");
        String[] children = dir.list();
        if (children == null) {
            System.out.println("this dir is not existed");
        } else {
            for (int i = 0; i < children.length; ++i) {
                String filename = children[i];
                System.out.println(filename);
            }
        }
    }
}