import java.util.*;

public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector(3, 2);

        System.out.println("Initial size:" + v.size());
        System.out.println("Initial capacity:" + v.capacity());
        v.addElement(new Integer(1));
        v.addElement(new Integer(2));
        v.addElement(new Integer(3));
        v.addElement(new Integer(4));
        System.out.println("Capactity after four additons:" + v.capacity());

        v.addElement(new Double(5.45));
        System.out.println("Current capacity:" + v.capacity());

        v.addElement(new Double(6.08));
        v.addElement(new Integer(7));
        System.out.println("Current capacity:" + v.capacity());

        v.addElement(new Float(9.4));
        v.addElement(new Integer(10));
        System.out.println("Current capacity:" + v.capacity());


        v.addElement(new Integer(11));
        v.addElement(new Integer(12));
        System.out.println("First element:" + v.firstElement());
        System.out.println("Last element:" + v.lastElement());

        if (v.contains(new Integer(3))) {
            System.out.println("Vector contains 3.");
        }
        Enumeration vEnum =  v.elements();
        while (vEnum.hasMoreElements()) {
            System.out.println(vEnum.nextElement());
        }
    }
}