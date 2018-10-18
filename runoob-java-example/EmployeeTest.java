import java.io.*;
public class EmployeeTest {
    public static void main(String[] args) {
        Employee2 empOne = new Employee2("runoob1");
        Employee2 empTwo = new Employee2("runoob2");

        empOne.empAge(26);
        empOne.empDesignation("高级程序员");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("菜鸟cxy");
        empTwo.empSalary(500);
        empTwo.printEmployee();
    }
}