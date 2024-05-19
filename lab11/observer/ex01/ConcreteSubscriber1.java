package lab11.observer.ex01;

public class ConcreteSubscriber1 implements Subscriber {
    @Override
    public void update(int state) {
        System.out.println("Concrete Subscriber 1 updated state " + state);
    }
}