import java.io.*;

import com.sun.org.apache.regexp.internal.recompile;

public class DIrSearchFileEmp {
    public static void main(String[] args) {
        File dir = new File("/tmp");
        FilenameFilter filenameFilter = new FilenameFilter(){
        
            @Override
            public boolean accept(File dir, String name) {
                return name.startsWith("j");
            }
        };
        String[] children = dir.list(filenameFilter);
        if (children == null) {
            System.out.println("dir is not existed or it is not a dir");
        } else {
            for (int i = 0; i < children.length; ++i) {
                System.out.println(children[i]);
            }
        }
    }
}