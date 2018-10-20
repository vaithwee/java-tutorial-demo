import java.util.LinkedList;

public class DataUpdateEmp {
    public static void main(String[] args) {
        LinkedList officers = new LinkedList();
        officers.add("b");
        officers.add("b");
        officers.add("t");
        officers.add("h");
        officers.add("p");

        System.out.println(officers);
        officers.set(2, "m");
        System.out.println(officers);
    }
}