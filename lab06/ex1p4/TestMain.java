package lab06.ex1p4;

public class TestMain {
    public static void main(String[] args) {
        testCircle();
        testRectangle();
        testSquare();
    }

    public static void testCircle() {
        Circle circle = new Circle(2.0, "pink", true);
        System.out.println("1. Test Circle");
        System.out.printf("Test toString():\n%s\n", circle.toString());
        System.out.printf("Test getArea(): %.2f\n", circle.getArea());
        System.out.printf("Test getPerimeter(): %.2f\n", circle.getPerimeter());
    }

    public static void testRectangle() {
        Rectangle rectangle = new Rectangle(3.0, 4.0, "blue", true);
        System.out.println("2. Test Rectangle");
        System.out.printf("Test toString():\n%s\n", rectangle.toString());
        System.out.printf("Test getArea(): %.2f\n", rectangle.getArea());
        System.out.printf("Test getPerimeter(): %.2f\n", rectangle.getPerimeter());
    }

    public static void testSquare() {
        Square square = new Square(3.0, "purple", true);
        System.out.println("3. Test Square");
        System.out.printf("Test toString():\n%s\n", square.toString());
        System.out.printf("Test getArea(): %.2f\n", square.getArea());
        System.out.printf("Test getPerimeter(): %.2f\n", square.getPerimeter());
        square.setSide(4.0);
        System.out.printf("Test setSide(%.2f) and getSide(): side = %.2f", 4.0, square.getSide());
    }
}
