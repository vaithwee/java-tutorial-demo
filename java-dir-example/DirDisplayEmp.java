import java.io.*;

public class DirDisplayEmp {
    public static void main(String[] args) {
        File dir = new File("/tmp");
        File[] files = dir.listFiles();
        FileFilter ff = new FileFilter(){
        
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        };

        files = dir.listFiles(ff);
        System.out.println(files.length);
        if (files.length == 0) {
            System.out.println("dir is not existed or it is not a dir");
        } else {
            for (int i = 0; i < files.length; ++i) {
                File filename = files[i];
                System.out.println(filename.toString());
            }
        }
    }
}