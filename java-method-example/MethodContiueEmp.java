public class MethodContiueEmp {
    public static void main(String[] args) {
        StringBuffer searchStr = new StringBuffer("hello how are you.");
        int length = searchStr.length();
        int count = 0;
        for (int i = 0; i < length; ++i) {
            if (searchStr.charAt(i) != 'h') {
                continue;
            }
            count++;
            searchStr.setCharAt(i, 'h');
        }
        System.out.println("found " + count + " 'h' character");
        System.out.println(searchStr);
    }
}