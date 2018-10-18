public class StringRegionMatchEmp {
    public static void main(String[] args) {
        String first_str = "Welcome to Microsoft";
        String second_str = "I work with microsoft";
        boolean mathc1 = first_str.regionMatches(11, second_str, 12, 9);
        boolean match2 = first_str.regionMatches(true, 11, second_str, 12, 9);
        System.out.println("don't ignore upper case:" + mathc1);
        System.out.println("ignore upper case:" + match2);
    }
}