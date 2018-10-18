public class MethodEnumAndSwitchEmp {
    public static void main(String[] args) {
        Car c = Car.tata;
        switch(c) {
            case lamborghini:
                System.out.println("you choose " + Car.lamborghini);
                break;
            case tata:
                System.out.println("you choose " + Car.tata);
                break;
            case audi:
                System.out.println("you choose " + Car.audi);
                break;
            case fiat:
                System.out.println("you choose " + Car.fiat);
                break;
            case honda:
                System.out.println("you choose " + Car.honda);
                break;
            default:
                System.out.println("I don't know you choose car type");
                break;
        }
    }
}

enum Car {
    lamborghini, tata, audi, fiat, honda
}