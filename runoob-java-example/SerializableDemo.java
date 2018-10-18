import java.io.*;

public class SerializableDemo {
    public static void main(String[] args) {
        EmployeeSerializable ew = new EmployeeSerializable();
        ew.name = "Reyan Ali";
        ew.address = "Phokka Kuan, Ambehta Peer";
        ew.SSN = 11122333;
        ew.number = 101;
        try {
            FileOutputStream fileOut = new FileOutputStream("/tmp/ew.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(ew);
            out.close();
            fileOut.close();
            System.out.println("Seralized data is saved in /tmp/ew.ser");
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}