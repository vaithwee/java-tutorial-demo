public class SearchStringExample {
    public static void main(String[] args) {
        String strOrig = "Google Runoob Taobao";
        int intIndex = strOrig.indexOf("Runoob");
        if (intIndex == -1) {
            System.out.println("Runoob is not found");
        } else {
            System.out.println("Runoob postion is " + intIndex);
        }
    }
}