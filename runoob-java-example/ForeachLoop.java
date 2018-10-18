public class ForeachLoop {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int x : numbers) {
            System.out.print(x + " ");
        }

        System.out.println();
        String[] names = {"James", "Larry", "Tom", "Lacy"};
        for (String name : names) {
            System.out.print(name + ", ");
        }
    }
}