package lab10.adapter.ex02;

public class TurkeyAdapter implements Duck {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble(); // Turkey's gobble method acts as Duck's quack method
    }

    @Override
    public void fly() {
        // Turkey's flyShortDistance method needs to be adapted to fly longer distances
        // Let's repeat the action multiple times to simulate longer flight
        for (int i = 0; i < 5; i++) {
            turkey.flyShortDistance();
        }
    }
}
