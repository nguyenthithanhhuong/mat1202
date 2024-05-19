package lab11.abstractfactory.ex02;

public class VictorianTable implements Table {
    @Override
    public void placeItemsOn() {
        System.out.println("Placing items on a Victorian table.");
    }
}