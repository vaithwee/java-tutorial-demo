import java.io.*;

public class FileReadEmp {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("/tmp/runoob.txt"));
            String str;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
            in.close();
            System.out.println(str);
        } catch (IOException e) {

        }
    }
}