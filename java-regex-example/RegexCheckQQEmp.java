public class RegexCheckQQEmp {
    public static void main(String[] args) {
        String regex = "[1-9]\\d{4,14}";
        System.out.println("123456".matches(regex));
        System.out.println("012345".matches(regex));
    }
}