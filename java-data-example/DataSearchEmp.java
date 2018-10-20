import java.util.LinkedList;

public class DataSearchEmp {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");
        linkedList.add("5");
        linkedList.add("2");

        System.out.println("element 2 first index: " + linkedList.indexOf("2"));
        System.out.println("element 2 last index: " + linkedList.lastIndexOf("2"));
    }
}