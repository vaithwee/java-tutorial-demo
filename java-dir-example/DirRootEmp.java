import java.io.*;

public class DirRootEmp {
    public static void main(String[] args) {
        File[] roots = File.listRoots();
        System.out.println("system root:");
        for (int i = 0; i < roots.length; ++i) {
            System.out.println(roots[i].toString());
        }
    }
}