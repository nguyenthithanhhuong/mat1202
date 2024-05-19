package lab04.ex2p10;

public class Test {
    public static void main(String[] args) {
        MyPoint topLeft = new MyPoint(2, 4);
        MyPoint bottomRight = new MyPoint(5, 2);

        MyRectangle rectangle = new MyRectangle(topLeft, bottomRight);

        System.out.println("1. Test constructor and toString():");
        System.out.println(rectangle.toString());

        System.out.println("2. Test getWidth():");
        System.out.println(rectangle.getWidth());

        System.out.println("3. Test getHeight():");
        System.out.println(rectangle.getHeight());

        System.out.println("4. Test getPerimeter():");
        System.out.println(rectangle.getPerimeter());

        System.out.println("5. Test getArea():");
        System.out.println(rectangle.getArea());
    }
}
