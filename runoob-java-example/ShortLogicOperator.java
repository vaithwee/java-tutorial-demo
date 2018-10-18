public class ShortLogicOperator {
    public static void main(String[] args) {
        int a = 5;
        boolean b =a<4&&(a++<10);
        System.out.println("b value is " + b);
        System.out.println("a value is " + a);
    }
}