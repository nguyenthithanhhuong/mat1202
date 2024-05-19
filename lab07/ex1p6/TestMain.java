package lab07.ex1p6;

public class TestMain {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        System.out.println("1. Test Cat:");
        Cat cat = new Cat("Cat01");
        System.out.print("cat greets(): ");
        cat.greets();

        System.out.println("2. Test Dog:");
        Dog dog = new Dog("Dog01");
        System.out.print("dog greets(): ");
        dog.greets();
        System.out.print("dog greets(another): ");
        dog.greets(new Dog("Dog02"));

        System.out.println("3. Test BigDog:");
        BigDog bigDog = new BigDog("BigDog01");
        System.out.print("bigDog greets(): ");
        bigDog.greets();
        System.out.print("bigDog greets(another Dog): ");
        bigDog.greets(new BigDog("Dog02"));
        System.out.print("bigDog greets(another BigDog): ");
        bigDog.greets(new BigDog("BigDog02"));
    }
}
