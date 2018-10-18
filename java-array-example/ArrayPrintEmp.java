public class ArrayPrintEmp {
    public static void main(String[] args) {
        String[] runoobs = new String[3];
        runoobs[0] = "runoob class";
        runoobs[1] = "runoob object";
        runoobs[2] = "runoob note";

        for (int i = 0; i < runoobs.length; ++i) {
            System.out.println(runoobs[i]);
        }
    }
}