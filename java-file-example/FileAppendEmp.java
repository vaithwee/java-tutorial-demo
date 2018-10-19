import java.io.*;

public class FileAppendEmp {
    public static void main(String[] args) throws Exception {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("/tmp/filename"));
            bw.write("aString1\n");
            bw.close();
            bw = new BufferedWriter(new FileWriter("/tmp/filename", true));
            bw.write("aString2");
            bw.close();
            BufferedReader in = new BufferedReader(new FileReader("/tmp/filename"));
            String str;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
            in.close();
        } catch (IOException e) {
            System.out.println("exception occoured:" + e);
        }
    }
}