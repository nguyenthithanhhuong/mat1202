package lab10.singleton.ex03;

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println("Are both instances the same? " + (singleton1 == singleton2)); // Output: true

        singleton1.someMethod();
    }
}
