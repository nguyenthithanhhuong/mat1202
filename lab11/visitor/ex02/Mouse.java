package lab11.visitor.ex02;

public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor v) {
        v.visit(this);
    }

    @Override
    public String toString() {
        return "Mouse";
    }
}