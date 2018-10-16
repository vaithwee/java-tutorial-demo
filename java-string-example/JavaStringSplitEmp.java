public class JavaStringSplitEmp {
    public static void main(String[] args) {
        String str = "www-runoob-com";
        String[] tmp;
        String delimeter = "-";
        tmp = str.split(delimeter);
        for (int i = 0; i < tmp.length; i++) {
            System.out.println(tmp[i]);
            System.out.println("");
        }

        System.out.println("----- java for each output method ------");
        String str1 = "www.runoob.com";
        String[] temp;
        String delimeter1 = "\\.";
        temp = str1.split(delimeter1);
        for (String x : temp) {
            System.out.println(x);
            System.out.println();
        }
    }
}