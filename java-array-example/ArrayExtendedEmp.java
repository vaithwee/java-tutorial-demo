public class ArrayExtendedEmp {
    public static void main(String[] args) {
        String[] names = new String[] {"a", "b", "c"};
        String[] extended = new String[5];

        extended[3] = "d";
        extended[4] = "e";
        System.arraycopy(names, 0, extended, 0, names.length);
        for (String str : extended) {
            System.out.println(str);
        }
    }
}