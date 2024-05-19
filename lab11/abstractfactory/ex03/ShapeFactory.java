package lab11.abstractfactory.ex03;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String typeShape) {
        if (typeShape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (typeShape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}