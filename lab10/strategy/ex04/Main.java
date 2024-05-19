package lab10.strategy.ex04;

public class Main {
    public static void main(String[] args) {
        Strategy addStrategy = new AddStrategy();
        Strategy subtractStrategy = new SubtractStrategy();

        Calculator calculatorAdd = new Calculator(addStrategy);
        Calculator calculatorSubtract = new Calculator(subtractStrategy);

        int resultAdd = calculatorAdd.executeStrategy(5, 3);
        int resultSubtract = calculatorSubtract.executeStrategy(5, 3);

        System.out.println("Result of addition: " + resultAdd);
        System.out.println("Result of subtraction: " + resultSubtract);
    }
}
