import java.util.LinkedList;
import java.util.Queue;

public class DataQueueEmp {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.add("d");
        queue.add("e");
        for (String q : queue) {
            System.out.println(q);
        }
        System.out.println("====");
        System.out.println("poll = " + queue.poll());
        for (String q : queue) {
            System.out.println(q);
        }

        System.out.println("====");
        System.out.println("element = " + queue.element());
        for (String q : queue) {
            System.out.println(q);
        }

        System.out.println("====");
        System.out.println("peek = " + queue.peek());
        for (String q : queue) {
            System.out.println(q);
        }
    }
}