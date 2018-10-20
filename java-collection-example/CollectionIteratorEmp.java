import java.util.*;

public class CollectionIteratorEmp {
    public static void main(String[] args) {
        setTest();
        listTest();
    }

    private static void setTest() {
        Set<String> set= new HashSet<String>();
        set.add("java");
        set.add("c");
        set.add("c++");
        set.add("java");
        set.add("javascript");

        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String value = it.next();
            System.out.println(value);
        }

        for (String s : set) {
            System.out.println(s);
        }
    }

    private static void listTest() {
        List<String> list = new ArrayList<String>();
        list.add("cai");
        list.add("niao");
        list.add("jiao");
        list.add("chen");
        list.add("www.runoob.com");

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String value = it.next();
            System.out.println(value);
        }

        for (int i = 0; i < list.size(); i++) {
            String value = list.get(i);
            System.out.println(value);
        }

        for (String value : list) {
            System.out.println(value);
        }
    }
}