package lab10.strategy.ex02;

public class ConcreteStrategySubtract implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}