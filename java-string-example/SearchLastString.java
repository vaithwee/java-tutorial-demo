public class SearchLastString {
    public static void main(String[] args) {
        String strOrig = "hello world, hello runoob";
        int lastIndex = strOrig.lastIndexOf("runoob");
        if (lastIndex == -1) {
            System.out.println("don't search char");
        } else {
            System.out.println("runoob last position is " + lastIndex);
        }
    }
}