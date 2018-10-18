import java.io.*;

public class ObjectVariable {
    public static void main(String[] args) {
        Employeee em = new Employeee("Runoob");
        em.printEmp();
    }
}

class Employeee {
    public String name;
    private double salary;
    public Employeee(String empName) {
        name = empName;
    }
    public void setSalary(double empSal) {
        salary = empSal;
    }

    public void printEmp() {
        System.out.println("name: " + name);
        System.out.println("salary: " + salary);
    }
}