public class MethodLabelEmp {
    public static void main(String[] args) {
        String strSearch = "This is the string in which you havae to search for a substring";
        String substring = "substring";
        boolean found = false;
        int max = strSearch.length() - substring.length();
        testlnl:
        for (int i = 0; i <= max; ++i) {
            int length = substring.length();
            int j = i;
            int k = 0;
            while (length-- != 0) {
                if (strSearch.charAt(j++) != substring.charAt(k++)) {
                    continue testlnl;
                }
            }
            found = true;
            break testlnl;
        }

        if (found) {
            System.out.println("found sub string");
        } else {
            System.out.println("don't have sub string");
        }
    }
}