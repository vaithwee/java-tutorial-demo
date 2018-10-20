import java.util.LinkedList;

public class DataElementEmp {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("100");
        linkedList.add("200");
        linkedList.add("300");
        linkedList.add("400");
        linkedList.add("500");
        System.out.println("link list first element is " + linkedList.getFirst());
        System.out.println("link list last element is " + linkedList.getLast());
    }
}