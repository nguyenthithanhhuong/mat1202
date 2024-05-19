package lab11.observer.ex02;

public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("Updated status.");
    }
}