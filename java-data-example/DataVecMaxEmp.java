import java.util.Collections;
import java.util.Vector;

public class DataVecMaxEmp {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(new Double("3.4324"));
        v.add(new Double("3.3432"));
        v.add(new Double("3.342"));
        v.add(new Double("3.349"));
        v.add(new Double("2.3"));
        Object obc = Collections.max(v);
        System.out.println("max element is " + obc);
    }
}