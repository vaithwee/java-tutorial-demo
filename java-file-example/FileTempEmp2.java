import java.io.*;

public class FileTempEmp2 {
    public static void main(String[] args) {
        File f = null;
        try {
            f = File.createTempFile("tmp", ".txt", new File("/tmp"));
            System.out.println("file path: " + f.getAbsolutePath());
            f.deleteOnExit();
            f = File.createTempFile("tmp", null, new File("/tmp"));
            System.out.println("file path: " + f.getAbsolutePath() );
            f.deleteOnExit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}