package lab11.factorymethod.ex02;

public class ConcreteCreatorB extends Creator {
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}