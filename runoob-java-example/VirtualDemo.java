public class VirtualDemo {
    public static void main(String[] args) {
        Salary s =  new Salary("worker 1", "Beijing", 3, 3600);
        Employeeee e = new Salary("worker 2", "Shanghai", 2, 2400.00);
        System.out.println("use salary mail check method");
        s.mainCheck();
        System.out.println("use emplyoeeee mail check method");
        e.mainCheck();
    }
}