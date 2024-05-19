package lab11.observer.ex02;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer obj1 = new BinaryObserver(subject);
        Observer obj2 = new HexaObserver(subject);
        Observer obj3 = new OctalObserver(subject);

        subject.notifyAllObservers();
    }
}
