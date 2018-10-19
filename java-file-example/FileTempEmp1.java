import java.io.*;

public class FileTempEmp1 {
    public static void main(String[] args) throws Exception {
        File temp = File.createTempFile("test", ".txt");
        System.out.println("file path:" + temp.getAbsolutePath());
        temp.deleteOnExit();
        BufferedWriter out = new BufferedWriter(new FileWriter(temp));
        out.write("aString");
        System.out.println("temp file had create");
        out.close();
    }
}