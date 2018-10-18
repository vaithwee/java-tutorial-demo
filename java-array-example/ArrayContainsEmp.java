import java.util.ArrayList;

public class ArrayContainsEmp {
    public static void main(String[] args) {
        ArrayList<String> objArr1 = new ArrayList<String>();
        ArrayList<String> objArr2 = new ArrayList<String>();

        objArr2.add(0, "common1");;
        objArr2.add(1, "common2");
        objArr2.add(2, "notcommon");
        objArr2.add(3, "notcommon1");

        objArr1.add(0, "common1");
        objArr1.add(1, "common2");

        System.out.println("array 1 element: " + objArr1);
        System.out.println("array 2 element: " + objArr2);

        System.out.println("array 1 contains common2 :" + objArr1.contains("common2"));
        System.out.println("array 2 contains array 1 :" + objArr2.contains(objArr1));
    }
}