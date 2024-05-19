package lab11.visitor.ex02;

public class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor v) {
        v.visit(this);
    }

    @Override
    public String toString() {
        return "Keyboard";
    }
}