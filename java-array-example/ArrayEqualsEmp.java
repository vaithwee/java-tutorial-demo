import java.util.Arrays;

public class ArrayEqualsEmp {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {1, 2, 3, 4, 5, 6};
        int[] arr3 = {1, 2, 3, 4};
        System.out.println("arr is equals arr2 :" + Arrays.equals(arr, arr2));
        System.out.println("arr is equals arr3 :" + Arrays.equals(arr, arr3));
    }
}