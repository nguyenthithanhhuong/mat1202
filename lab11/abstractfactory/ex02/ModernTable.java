package lab11.abstractfactory.ex02;

public class ModernTable implements Table {
    @Override
    public void placeItemsOn() {
        System.out.println("Placing items on a Modern table.");
    }
}