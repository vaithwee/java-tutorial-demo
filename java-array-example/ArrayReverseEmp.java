import java.util.ArrayList;
import java.util.Collections;

public class ArrayReverseEmp {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        System.out.println("before reverse array: " + arrayList);
        Collections.reverse(arrayList);
        System.out.println("after reverse array: " + arrayList);
    }
}