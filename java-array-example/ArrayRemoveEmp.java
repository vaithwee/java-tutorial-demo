import java.util.ArrayList;

public class ArrayRemoveEmp {
    public static void main(String[] args) {
        ArrayList<String> objArray = new ArrayList<String>();
        objArray.clear();
        objArray.add(0, "first element");
        objArray.add(1, "second element");
        objArray.add(2, "third element");

        System.out.println("array before remove: " + objArray);
        objArray.remove(1);
        objArray.remove("first element");
        System.out.println("array after remove: " + objArray);
    }
}