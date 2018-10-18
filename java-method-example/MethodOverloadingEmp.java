public class MethodOverloadingEmp {
    public static void main(String[] args) {
        MyClass mc = new MyClass(3);
        mc.info();
        mc.info("method overloading");
        new MyClass();
    }
}

class MyClass {
    int height;
    MyClass() {
        System.out.println("init without params");
        height = 4;
    }

    MyClass(int i) {
        System.out.println("house heigth is " + i + " m");
        height = i;
    }

    void info() {
        System.out.println("house heigth is " + height + " m");
    }

    void info(String info) {
        System.out.println(info + ": house heigth is " + height + " m");
    }
}