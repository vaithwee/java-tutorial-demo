public class Puppy {
    int puppyAge;
    public Puppy(String name) {
        System.out.println("dog name is " + name);
    }

    public void setAge(int age) {
        puppyAge = age;
    }

    public int getAge() {
        System.out.println("dog age is " + puppyAge);
        return puppyAge;
    }

    public static void main(String[] args) {
        Puppy mp = new Puppy("tommy");
        mp.setAge(2);
        mp.getAge();
        System.out.println("age valus is " + mp.puppyAge);
    }
}