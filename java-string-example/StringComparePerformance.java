public class StringComparePerformance {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000;++i) {
            String s1 = "hello";
            String s2 = "hello";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("use String create variable time cost is " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; ++i) {
            String s3 = new String("hello");
            String s4 = new String("hello");
        }
        endTime = System.currentTimeMillis();
        System.out.println("use new create variable time cost is " + (endTime - startTime) + "ms");
    }
}