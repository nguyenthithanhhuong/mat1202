package lab11.decorator.ex01;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Draw red shape");
    }

    public void setRedBorder() {

    }
}
