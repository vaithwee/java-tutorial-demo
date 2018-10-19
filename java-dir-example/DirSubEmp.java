import java.io.*;

public class DirSubEmp {
    public static void main(String[] args) {
        File dir = new File("/tmp");
        String[] children = dir.list();
        if (children == null) {
            System.out.println("dir is not existed or it is not a dir");
        } else {
            for (int i = 0; i < children.length; ++i) {
                String fileName = children[i];
                System.out.println(fileName);
            }
        }
    }
}