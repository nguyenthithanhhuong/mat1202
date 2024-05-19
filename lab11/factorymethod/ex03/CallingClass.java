package lab11.factorymethod.ex03;

public class CallingClass {
    public static void main(String[] args) {
        FruitFactory factory = new FruitFactory();
        factory.produceFruit("APPLE");
        factory.produceFruit("BANANA");
        factory.produceFruit("ORANGE");
    }
}