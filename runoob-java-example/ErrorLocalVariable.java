public class ErrorLocalVariable {
    public void pupAge() {
        int age;
        age = age + 7;
        System.out.println("dog age is " + age);
    }

    public static void main(String[] args) {
        ErrorLocalVariable err = new ErrorLocalVariable();
        err.pupAge();
    }
}