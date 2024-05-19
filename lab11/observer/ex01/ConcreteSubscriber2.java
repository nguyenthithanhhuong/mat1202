package lab11.observer.ex01;

public class ConcreteSubscriber2 implements Subscriber {
    @Override
    public void update(int state) {
        System.out.println("Concrete Subscriber 2 updated state " + state);
    }
}