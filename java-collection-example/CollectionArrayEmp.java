import java.util.*;
import java.io.*;

public class CollectionArrayEmp {
    public static void main(String[] args) throws IOException {
        int n = 5;
        String[] name = new String[n];
        for (int i = 0; i < n; ++i) {
            name[i] = String.valueOf(i);
        }

        List<String> list = Arrays.asList(name);
        System.out.println();

        for (String li : list) {
            String str = li;
            System.out.println(str + " ");
        }
    }
}