import java.util.*;

public class DataReplaceEmp {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("1");
        linkedList.add("8");
        linkedList.add("6");
        linkedList.add("4");
        linkedList.add("5");
        System.out.println(linkedList);
        linkedList.subList(2, 4).clear();
        System.out.println(linkedList);
    }
}