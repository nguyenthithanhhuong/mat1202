package lab11.visitor.ex01;

public class JavaCoreBook implements ProgramingBook {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getResource() {
        return "";
    }
}
