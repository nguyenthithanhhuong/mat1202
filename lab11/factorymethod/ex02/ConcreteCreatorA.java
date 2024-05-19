package lab11.factorymethod.ex02;

public class ConcreteCreatorA extends Creator {
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}