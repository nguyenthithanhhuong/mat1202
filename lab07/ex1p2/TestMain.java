package lab07.ex1p2;

public class TestMain {
    public static void main(String[] args) {
        testCircle();
        testRectangle();
    }

    public static void testCircle() {
        System.out.println("1. Test Circle:");
        Circle circle = new Circle(2.0);
        System.out.println(circle.toString());
        System.out.printf("getArea(): %.2f\n", circle.getArea());
        System.out.printf("getPerimeter(): %.2f\n", circle.getPerimeter());
    }

    public static void testRectangle() {
        System.out.println("2. Test Rectangle:");
        Rectangle rectangle = new Rectangle(3.0, 4.0);
        System.out.println(rectangle.toString());
        System.out.printf("getArea(): %.2f\n", rectangle.getArea());
        System.out.printf("getPerimeter(): %.2f\n", rectangle.getPerimeter());
    }
}
