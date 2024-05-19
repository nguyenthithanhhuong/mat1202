package lab11.iterator.ex01;

public class IteratorPatternExample {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog(
                new String[] {"A1", "A2", "A3"});
        Iterator iterator = productCatalog.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
