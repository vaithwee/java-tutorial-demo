import java.util.*;

public class DataLinkedListEmp {

    private LinkedList linkedList = new LinkedList();
    public void push(Object v) {
        linkedList.addFirst(v);
    }

    public Object top() {
        return linkedList.getFirst();
    }

    public Object pop() {
        return linkedList.removeFirst();
    }

    public static void main(String[] args) {
        DataLinkedListEmp stack = new DataLinkedListEmp();
        for (int i = 30; i < 40; ++i) {
            stack.push(new Integer(i));
        }
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}