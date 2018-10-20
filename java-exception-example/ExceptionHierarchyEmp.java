public class ExceptionHierarchyEmp {
    public static void main(String[] args) throws Exception {
        Demo d = new Demo();
        try {
            int x = d.div(4, 0);
            System.out.println("x=" + x);;
        } catch (ArithmeticException e) {
           System.out.println(e.toString());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        System.out.println("Over");
    }
}

class Demo {
    int div(int a, int b) throws ArithmeticException, ArrayIndexOutOfBoundsException {
        int[] arr = new int[a];
        System.out.print(arr[4]);
        return a/b;
    }
}