package lab11.visitor.ex02;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPartVisitor visitor = new ComputerPartDisplayVisitor();

        Keyboard keyboard = new Keyboard();
        Mouse mouse = new Mouse();
        Monitor monitor = new Monitor();
        Computer computer = new Computer(new ComputerPart[]{keyboard, mouse, monitor});

        keyboard.accept(visitor);
        mouse.accept(visitor);
        monitor.accept(visitor);
        computer.accept(visitor);
    }
}