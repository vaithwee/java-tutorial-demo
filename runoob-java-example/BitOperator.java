public class BitOperator {
    public static void main(String[] args) {
        //& all is 1 then bit is 1, else 0
        int a = 60;
        int b = 13;
        int c = 0;

        c = a & b;
        System.out.println("a & b = " + c);

        c = a | b;
        System.out.println("a | b = " + c);

        c = ~a;
        System.out.println("~a = " + c);

        c = a << 2;
        System.out.println("a << 2 = " + c);

        c = a >> 2;
        System.out.println("a >> 2 = "  + c);

        c = a >>> 2;
        System.out.println("a >>> 2 = " + c);
    }
}