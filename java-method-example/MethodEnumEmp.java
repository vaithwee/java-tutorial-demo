enum CarPrice {
    lamborghini(900), tata(2), audi(50), fiat(15), honda(12);
    private int price;
    CarPrice(int p) {
        price = p;
    }
    int getPrice() {
        return price;
    }
}

public class MethodEnumEmp {
    public static void main(String[] args) {
        System.out.println("All car price:");
        for (CarPrice c: CarPrice.values()) {
            System.out.println(c + " need " + c.getPrice() + " dollars");
        }
    }
}