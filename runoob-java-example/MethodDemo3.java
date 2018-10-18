public class MethodDemo3 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        System.out.println("Before swap num1 value is " + num1 + ", num2 value is " + num2);
        swap(num1, num2);
        System.out.println("After swap num1 value is " + num1 + ", num2 value is " + num2);
    }

    public static void swap(int n1, int n2) {
        System.out.println("\tEnter swap method");
        System.out.println("\t\tBefore swap n1 value is " + n1 + ", n2 value is " + n2);
        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("\t\tAfter swap n1 value is " + n1 + ", n2 value is " + n2);
    }
}