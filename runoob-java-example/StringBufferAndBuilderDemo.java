public class StringBufferAndBuilderDemo {
    public static void main(String[] args) {
        StringBuffer sBuffer = new StringBuffer("runoob web site address :");
        sBuffer.append("www");
        sBuffer.append(".runoob");
        sBuffer.append(".com");
        System.out.println(sBuffer);
    }
}