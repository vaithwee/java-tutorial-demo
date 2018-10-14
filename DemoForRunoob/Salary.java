public class Salary extends Employeeee {
    private double salary;
    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);
    }

    public void mainCheck() {
        System.out.println("Salary mail check method");
        System.out.println("mail check is for" + getName() + ", salary is " + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0.0) {
            this.salary = salary;
        }
        
    }

    public double computePay() {
        System.out.println("compute salary is for " + getName());
        return salary/52;
    }
}