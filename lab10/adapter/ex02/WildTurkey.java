package lab10.adapter.ex02;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void flyShortDistance() {
        System.out.println("Flying short distance");
    }
}
