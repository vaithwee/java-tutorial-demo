public class ExceptionOverloadMethodEmp {
    public static void main(String[] args) {
        ExceptionOverloadMethodEmp mn = new ExceptionOverloadMethodEmp();
        try {
            System.out.println(method(10, 20.0));
            System.out.println(method(10.0, 20));
            System.out.println(method(10.0, 20.0));
            System.out.println(mn.method(10));
        } catch (Exception e) {
            System.out.println("exception occiure:" + e);
        }
    }

    double method(int i) throws Exception {
        return i/0;
    }
    
    boolean method(boolean b) {
        return !b;
    }

    static double method(int x, double y) throws Exception {
        return x + y;
    }

    static double method(double x, double y) {
        return x + y - 3;
    }
    
}