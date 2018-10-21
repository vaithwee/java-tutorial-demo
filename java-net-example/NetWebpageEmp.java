import java.io.*;
import java.net.URL;

public class NetWebpageEmp {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://www.runoob.com");
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        BufferedWriter writer = new BufferedWriter(new FileWriter("data.html"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            writer.write(line);
            writer.newLine();
        }
        reader.close();
        writer.close();
    }
}