package lab11.abstractfactory.ex03;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        FactoryProducer factoryProducer = new FactoryProducer();

        AbstractFactory factory1 = factoryProducer.getFactory("SHAPE_FACTORY");
        Shape shape1 = factory1.getShape("RECTANGLE");
        shape1.draw();
        Shape shape2 = factory1.getShape("SQUARE");
        shape2.draw();

        AbstractFactory factory2 = factoryProducer.getFactory("ROUNDED_SHAPE_FACTORY");
        Shape shape3 = factory2.getShape("RECTANGLE");
        shape3.draw();
        Shape shape4 = factory2.getShape("SQUARE");
        shape4.draw();
    }
}