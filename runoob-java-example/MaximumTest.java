public class MaximumTest {
    public static void main(String[] args) {
        System.out.printf("%d %d %d, the max is %d", 3, 4, 5, maximum(3,4,5));
        System.out.printf("%.1f %.1f %.1f, the max is %.1f", 6.6, 8.8, 7.7, maximum(6.6, 8.8, 7.7));
        System.out.printf("%s %s %s, the max is %s", "pear", "apple", "orange", maximum("pear", "apple", "orange"));
    }

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }

        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }
}