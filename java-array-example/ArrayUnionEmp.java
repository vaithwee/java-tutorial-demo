import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayUnionEmp {
    public static void main(String[] args) {
        String[] arr1 = {"1", "2", "3"};
        String[] arr2 = {"4", "5", "6"};
        String[] result = union(arr1, arr2);
        System.out.println("array union :");
        for (String var : result) {
            System.out.println(var);
        }
    }

    public static String[] union(String[] arr1, String[] arr2) {
        Set<String> set = new HashSet<String>();
        for (String var : arr1) {
            set.add(var);
        }

        for (String var : arr2) {
            set.add(var);
        }
        String[] result = {};
        return set.toArray(result);
    }
}