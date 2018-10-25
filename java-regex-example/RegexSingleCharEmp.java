public class RegexSingleCharEmp {
    public static void main(String[] args) {
        String regex = "[abc]"; //[]匹配单个字符
        System.out.println("a".matches(regex));
        System.out.println("b".matches(regex));
        System.out.println("c".matches(regex));
        System.out.println("d".matches(regex));
        System.out.println("1".matches(regex));
        System.out.println("%".matches(regex));
    }
}