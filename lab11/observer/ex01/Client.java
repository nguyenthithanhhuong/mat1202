package lab11.observer.ex01;

public class Client {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        Subscriber subscriber1 = new ConcreteSubscriber1();
        Subscriber subscriber2 = new ConcreteSubscriber2();

        publisher.subscriber(subscriber1);
        publisher.subscriber(subscriber2);

        publisher.mainBusinessLogic(6);
        publisher.mainBusinessLogic(8);
    }
}