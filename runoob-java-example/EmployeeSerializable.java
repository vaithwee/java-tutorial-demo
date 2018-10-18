import java.io.Serializable;

public class EmployeeSerializable implements Serializable {
    public String name;
    public String address;
    public transient int SSN;
    public int number;
    public void mainCheck() {
        System.out.println("Mailing a check to" + name + " " + address);
    }
}