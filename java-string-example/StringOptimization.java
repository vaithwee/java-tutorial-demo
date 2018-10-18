public class StringOptimization {
    public static void main(String[] args) {
        String variables[] = new String[50000];
        for (int i = 0; i < 50000; ++i) {
            variables[i] = "s" + i;
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; ++i) {
            variables[i] = "hello";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("直接使用字符串：" + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; ++i) {
            variables[i] = new String("hello");
        }
        endTime = System.currentTimeMillis();
        System.out.println("使用 new 关键字：" + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; ++i) {
            variables[i] = new String("hello");
            variables[i] = variables[i].intern();
        }
        endTime = System.currentTimeMillis();
        System.out.println("使用字符串对象的intern()方法：" + (endTime - startTime) + "ms");
    }
}