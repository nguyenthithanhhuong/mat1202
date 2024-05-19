package lab11.visitor.ex03;

public class Application {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
                new Dot(),
                new Circle(),
                new Rectangle(),
                new CompoundShape()
        };

        Visitor visitor = new XMLExportVisitor();

        for (Shape shape : shapes) {
            shape.accept(visitor);
        }
   }
}