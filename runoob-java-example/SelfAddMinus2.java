public class SelfAddMinus2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int x = 2 * ++a;
        int y = 2 * b++;
        System.out.println("a value is " + a + " x value is " + x);
        System.out.println("b value is " + b + " y value is " + y);
    }
}