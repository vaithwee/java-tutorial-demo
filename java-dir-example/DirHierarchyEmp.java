import java.io.File;
import java.io.IOException;

public class DirHierarchyEmp {
    public static void main(String[] args) throws IOException {
        showDir(1, new File("/tmp"));
    }

    static void showDir(int indent, File file) throws IOException {
        for (int i = 0; i < indent; ++i) {
            System.out.print('-');
        }
            System.out.println(file.getName());
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (int j = 0; j < files.length; ++j) {
                    showDir(indent + 4, files[j]);
                }
            }
        
    }


}