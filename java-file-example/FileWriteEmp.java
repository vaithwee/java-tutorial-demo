import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteEmp {
    public static void main(String[] args) {
       try {
           BufferedWriter out = new BufferedWriter(new FileWriter("/tmp/runoob.txt"));
           out.write("runoob.com");
           out.close();
           System.out.println("File create succeed!");
       } catch (IOException e) {
           
       } 
    }
}