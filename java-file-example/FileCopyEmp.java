import java.io.*;

public class FileCopyEmp {
    public static void main(String[] args) throws Exception {
        BufferedWriter out1 = new BufferedWriter(new FileWriter("/tmp/srcfile"));
        out1.write("string to be coped\n");
        out1.close();
        InputStream in = new FileInputStream(new File("/tmp/srcfile"));
        OutputStream out = new FileOutputStream(new File("/tmp/destnfile"));
        byte[] buf = new byte[1024];
        int len;
        while ((len = in.read(buf)) > 0) {
            out.write(buf, 0, len);
        }
        in.close();
        out.close();
        BufferedReader buf1 = new BufferedReader(new FileReader("/tmp/destnfile"));
        String str;
        while ((str = buf1.readLine()) != null) {
            System.out.println(str);
        }
        buf1.close();

    }
}