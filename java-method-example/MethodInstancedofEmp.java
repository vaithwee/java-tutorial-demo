import java.util.ArrayList;
import java.util.Vector;

public class MethodInstancedofEmp {
    public static void main(String[] args) {
        Object testObject = new ArrayList();
        displayObjectClass(testObject);
    }

    public static void displayObjectClass(Object o) {
        if (o instanceof Vector) {
            System.out.println("Object is java.util.Vector class object");
        } else if (o instanceof ArrayList) {
            System.out.println("Object is java.util.ArrayList class object");
        } else {
            System.out.println("Object is " + o.getClass() + " class object");
        }
    }
}