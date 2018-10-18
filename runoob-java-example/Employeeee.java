public class Employeeee {
    private String name;
    private String address;
    private int number;
    public Employeeee(String name, String address, int number) {
        System.out.println("emplyeeee init");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public void mainCheck() {
        System.out.println("mail check is for " + this.name + " " + this.address);
    }

    public String toString() {
        return name + " " + address + " " + number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

    public int getNumber() {
        return number;
    }
}