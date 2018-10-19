import java.io.File;

public class FileDirEmp {
    public static void main(String[] args) throws Exception {
        File file = null;
        File dir = new File("/tmp");
        file = File.createTempFile("JavaTemp", ".javatemp", dir);
        System.out.println(file.getPath());
    }
}