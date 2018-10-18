import java.util.ArrayList;

public class ArrayDiffSetEmp {
    public static void main(String[] args) {
        ArrayList objArray1 = new ArrayList();
        ArrayList objArray2 = new ArrayList();
        objArray2.add(0, "common1");
        objArray2.add(1, "common2");
        objArray2.add(2, "notcommon");
        objArray2.add(3, "notcommon1");

        objArray1.add(0, "common1");
        objArray1.add(1, "common2");
        objArray1.add(2, "notcommon2");

        System.out.println("array 1 element:" + objArray1);
        System.out.println("array 2 element:" + objArray2);
        objArray1.removeAll(objArray2);
        System.out.println("array 1 and array 2 diff set is " + objArray1);
    }
}