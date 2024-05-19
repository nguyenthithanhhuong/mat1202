package lab06.ex1p5;

public class TestMain {
    public static void main(String[] args) {
        testMammal();
        testCat();
        testDog();
    }

    public static void testMammal() {
        Mammal mammal = new Mammal("Rabbit");
        System.out.println("1. Test Mammal");
        System.out.printf("Test toString():\n%s\n", mammal.toString());
    }

    public static void testCat() {
        Cat cat = new Cat("Cat01");
        System.out.println("2. Test Cat");
        System.out.printf("Test toString():\n%s\n", cat.toString());
        System.out.println("Test greets():");
        cat.greets();
    }

    public static void testDog() {
        Dog dog = new Dog("Dog01");
        System.out.println("3. Test Dog");
        System.out.printf("Test toString():\n%s\n", dog.toString());
        System.out.println("Test greets():");
        dog.greets();
    }
}
