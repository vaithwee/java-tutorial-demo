public class StaticVariable {
    public static void main(String[] args) {
        Employeeee.salary = 1000;
        System.out.println(Employeeee.DEPARTMENT + " average wage is " + Employeeee.salary);
    }
}

class Employeeee {
    public static double salary;
    public static final String DEPARTMENT = "Developer";
    public static void SetSalary(double s) {
        salary = s;
    }
}