import java.util.*;

public class ForeachArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("Hahahaha");

        for (String str : list) {
            System.out.println(str);
        }

        String[] strArr = new String[list.size()];
        list.toArray(strArr);
        for (int i = 0; i < strArr.length; ++i) {
            System.out.println(strArr[i]);
        }

        Iterator<String> ite = list.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next());
        }
    }
}