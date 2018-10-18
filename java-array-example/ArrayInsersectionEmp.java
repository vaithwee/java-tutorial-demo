import java.util.ArrayList;

public class ArrayInsersectionEmp {
    public static void main(String[] args) {
        ArrayList objArr1 = new ArrayList();
        ArrayList objArr2 = new ArrayList();

        objArr2.add(0, "element1");
        objArr2.add(1, "element2");
        objArr2.add(2, "notcommon");
        objArr2.add(3, "notcommon1");

        objArr1.add(0, "element1");
        objArr1.add(1, "element2");
        objArr1.add(2, "notcommon2");

        System.out.println("array 1 element :" + objArr1);
        System.out.println("array 2 element :" + objArr2);

        objArr1.retainAll(objArr2);
        System.out.println("array1 & array1 :" + objArr1);

    }
}