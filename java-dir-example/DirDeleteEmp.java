import java.io.File;

public class DirDeleteEmp {
    public static void main(String[] args) throws Exception {
        deleteDir(new File("/tmp/hello"));
    }

    public static boolean deleteDir(File dir) {
        if (dir.isDirectory()) {
            String[] children = dir.list();
            for (int i = 0; i < children.length; ++i) {
                boolean success = deleteDir(new File(dir, children[i]));
                if (!success) {
                    return false;
                }
            }
        }
        if (dir.delete()) {
            System.out.println("dir had been deleted");
            return true;
        } else {
            System.out.println("dir deleted fail");
            return false;
        }
    }
}