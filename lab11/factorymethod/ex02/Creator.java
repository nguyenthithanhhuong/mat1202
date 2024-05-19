package lab11.factorymethod.ex02;

public abstract class Creator {
    public abstract Product createProduct();

    public void someOperation() {
        Product product = createProduct();
        product.use();
    }
}