
public class GenericsClassDemo {
    public static void main(String[] args) {
        Box<Integer> integeBox = new Box<Integer>();
        Box<String> sBox = new Box<String>();

        integeBox.add(new Integer(10));
        sBox.add(new String("www.runoob.com"));

        System.out.println("integer value is " + integeBox.get());
        System.out.println("string value is " + sBox.get());
    }
}

class Box<T> {
    private T t;
    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}