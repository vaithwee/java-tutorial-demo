public class GenericMethodDemo {

    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        System.out.println("int arr:");
        printArray(intArray);

        System.out.println("double arr:");
        printArray(doubleArray);

        System.out.println("char arr:");
        printArray(charArray);

    }
}