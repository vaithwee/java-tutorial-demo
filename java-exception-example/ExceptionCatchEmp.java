public class ExceptionCatchEmp {
    public static void main(String[] args) {
        int arr[] = {20,20,40};
        int num1 = 15, num2 = 10;
        int result = 10;
        try {
            result = num1 / num2;
            System.out.println("result: " + result);
            for (int i = 5; i >=0; --i) {
                System.out.println("array element: " + arr[i]);
            }
        } catch (Exception e) {
            System.out.println("exception:" + e);
        }
    }
}