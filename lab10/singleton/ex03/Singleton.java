package lab10.singleton.ex03;

public class Singleton {
    private static Singleton instance;
    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void someMethod() {
        System.out.println("Some method of Singleton class");
    }
}
