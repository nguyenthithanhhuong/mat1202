package lab11.factorymethod.ex03;

public class Banana implements Fruit {
    public Banana() {
        productJuice();
    }

    @Override
    public void productJuice() {
        System.out.println("Produced Banana");
    }
}