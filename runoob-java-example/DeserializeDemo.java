import java.io.*;

public class DeserializeDemo {
    public static void main(String[] args) {
        EmployeeSerializable e = null;
        try {
            FileInputStream fileIn = new FileInputStream("/tmp/ew.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (EmployeeSerializable)in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException b) {
            b.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Emplyoo class not found");
            c.printStackTrace();
            return;
        }

        System.out.println("Emplyoo deserialized:");
        System.out.println("Name:" + e.name);
        System.out.println("Address:" + e.address);
        System.out.println("SSN: " + e.SSN);
        System.out.println("Number:" + e.number);
        e.mainCheck();
    }
}