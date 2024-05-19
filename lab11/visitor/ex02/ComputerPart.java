package lab11.visitor.ex02;

public interface ComputerPart {
    public void accept(ComputerPartVisitor v);
}