public class MethodForEmp {
    public static void main(String[] args) {
        int[] intary = {1, 2, 3, 4};
        forDisplay(intary);
        foreachDisplay(intary);
    }

    public static void forDisplay(int[] a) {
        System.out.println("use for array");
        for (int i = 0; i < a.length; ++i) {
            System.out.println(a[i]);
        }
    }

    public static void foreachDisplay(int[] data) {
        System.out.println("usr foreach array");
        for (int a : data) {
            System.out.println(a);
        }
    }
}