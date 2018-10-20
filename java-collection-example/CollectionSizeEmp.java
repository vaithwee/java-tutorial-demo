import java.util.HashSet;
import java.util.Iterator;

public class CollectionSizeEmp {
    public static void main(String[] args) {
        System.out.println("colleciton exmaple!");
        int size;
        HashSet collection = new HashSet();
        String str1 = "Yellow", str2 = "White", str3 = "Green", str4 = "Blue";
        Iterator iterator;
        collection.add(str1);
        collection.add(str2);
        collection.add(str3);
        collection.add(str4);
        System.out.println("collection data:");
        iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        size = collection.size();
        if (collection.isEmpty()) {
            System.out.println("colleciton is empty");
        } else {
            System.out.println("collection size:" + size);
        }
    }
}