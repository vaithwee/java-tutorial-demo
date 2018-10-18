public class InstanceofOperator {
    public static void main(String[] args) {
        Vehicle a = new Car();
        boolean result = a instanceof Car;
        System.out.println(result);
    }
}

class Vehicle {}

class Car extends Vehicle {}