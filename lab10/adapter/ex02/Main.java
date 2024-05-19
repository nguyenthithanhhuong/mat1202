package lab10.adapter.ex02;

public class Main {
    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        // Using TurkeyAdapter as a Duck
        System.out.println("Turkey says:");
        turkey.gobble();
        turkey.flyShortDistance();

        System.out.println("\nDuck says:");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
