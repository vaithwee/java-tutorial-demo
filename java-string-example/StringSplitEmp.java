import java.util.StringTokenizer;

public class StringSplitEmp {
    public static void main(String[] args) {
       String str = "This is String, split by StringTokenizer, created by runoob" ;
       StringTokenizer st = new StringTokenizer(str);
       System.out.println("------ using space to spilt -----");
       while (st.hasMoreElements()) {
           System.out.println(st.nextElement());
       }

       System.out.println("----- use , to split -----");
       StringTokenizer st2 = new StringTokenizer(str, ",");
       while (st2.hasMoreElements()) {
           System.out.println(st2.nextElement());
       }
    }
}