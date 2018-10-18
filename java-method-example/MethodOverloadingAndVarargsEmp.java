public class MethodOverloadingAndVarargsEmp {
    static void vaTest(int... no) {
        System.out.print("vaTest(int...) " + "params number: " + no.length + " content: ");
        for (int n : no) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    static void vaTest(boolean... bl) {
        System.out.print("vaTest(boolean...) params number: " + bl.length + " content: ");
        for (boolean b : bl) {
            System.out.print(b + " ");
        }
        System.out.println();
    }

    static void vaTest(String msg, int... no) {
        System.out.print("vaTest(String, int...) message: " + msg + " params number: " + no.length + " content:");
        for (int b : no) {
            System.out.print(b + " ");
            
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest("测试", 10, 20);
        vaTest(true, false, false);
    }
}