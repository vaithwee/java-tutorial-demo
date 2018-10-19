import java.io.File;

public class DirTraverseEmp {
    public static void main(String[] args) throws Exception {
        System.out.println("Traverse Dir");
        File file = new File("/tmp");
        visitAllDirAndFiles(file);
    }

    public static void visitAllDirAndFiles (File dir) {
        System.out.println(dir);
        if (dir.isDirectory()) {
            String[] children = dir.list();
            for (int i =0; i < children.length; ++i) {
                visitAllDirAndFiles(new File(dir, children[i]));
            }
        }
    }
}