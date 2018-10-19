import java.io.*;

public class FileDeleteEmp {
    public static void main(String[] args) {
        try {
            File file = new File("/tmp/runoob.txt");
            if (file.delete()) {
                System.out.println(file.getName() + " file had delete");
            } else {
                System.out.println("file delete fail");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}