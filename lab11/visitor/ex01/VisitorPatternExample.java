package lab11.visitor.ex01;

public class VisitorPatternExample {
    public static void main(String[] args) {
        Visitor visitor = new VisitorImpl();
        BusinessBook book1 = new BusinessBook();
        DesignPatternBook book2 = new DesignPatternBook();
        JavaCoreBook book3 = new JavaCoreBook();

        book1.accept(visitor);
        book2.accept(visitor);
        book3.accept(visitor);
    }
}