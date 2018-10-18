public class MethodDemo1 {
    public static void main(String[] args) {
        int i = 5;
        int j = 7;
        int k = max(i, j);
        System.out.println(i + " and " + j + " compare, the max is " + k);
    }

    public static int max(int num1, int num2) {
        int result;
        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }
        return result;
    }
}