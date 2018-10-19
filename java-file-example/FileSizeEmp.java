import java.io.File;

public class FileSizeEmp {
    public static void main(String[] args) {
        long size = getFileSize("/tmp/filename");
        System.out.println("filename size is " + size);
    }

    public static long getFileSize(String filename) {
        File file = new File(filename);
        if (!file.exists() || !file.isFile()) {
            System.out.println("file is not existed");
            return -1;
        }
        return file.length();
    }
}