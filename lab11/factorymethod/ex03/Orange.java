package lab11.factorymethod.ex03;

public class Orange implements Fruit {
    public Orange() {
        productJuice();
    }
    @Override
    public void productJuice() {
        System.out.println("Produced Orange");
    }
}