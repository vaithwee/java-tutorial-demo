import java.util.*;

public class DataVeecsortEmp {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("x");
        v.add("m");
        v.add("d");
        v.add("a");
        v.add("o");

        Collections.sort(v);
        System.out.println(v);
        int index = Collections.binarySearch(v, "d");
        System.out.println("element index :" + index);
    }
}