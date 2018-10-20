import java.util.*;

public class CollectionShuffleEmp {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; ++i) {
            list.add(new Integer(i));
        }
        System.out.println("shuffle:");
        System.out.println(list);

        for (int i = 0; i < 6; ++i) {
            System.out.println(i);
            Collections.shuffle(list);
            System.out.println(list);
        }
    }
}