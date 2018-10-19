import java.io.File;

public class FileRenameEmp {
    public static void main(String[] args) {
        File oldName = new File("/tmp/filename");
        File newName = new File("/tmp/java.txt");
        if (oldName.renameTo(newName)) {
            System.out.println("had rename");
        } else {
            System.out.println("error");
        }
    }
}