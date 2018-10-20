public class ExceptionChainEmp {
    public static void main(String[] args) {
        int n = 20, result = 0;
        try {
            result = n/0;
        } catch (ArithmeticException e) {
            System.out.println("math exception: " + e);
            try {
                throw new NumberFormatException();
            } catch (NumberFormatException ex) {
                System.out.println("chain exception: " + ex);
            }
        }
    }
}