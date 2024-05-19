package lab06.ex2p2;

public class TestMain {
    public static void main(String[] args) {
        testCircle();
        testCylinder();
    }

    public static void testCircle() {
        Circle circle = new Circle(2.0, "pink");
        System.out.println("1. Test Circle");
        System.out.printf("Test toString():\n%s\n", circle.toString());
        System.out.printf("Test getRadius(): %.2f\n", circle.getRadius());
        circle.setColor("red");
        System.out.printf("Test setColor(%s) and getColor(): %s\n", "red", circle.getColor());
        System.out.printf("Test getArea(): %.2f\n", circle.getArea());
    }

    public static void testCylinder() {
        Cylinder cylinder = new Cylinder(2.0, 3.0, "green");
        System.out.println("2. Test Cylinder");
        System.out.printf("Test toString():\n%s\n", cylinder.toString());
        System.out.printf("Test getBase(): %s\n", cylinder.getBase().toString());
        System.out.printf("Test getVolume(): %.2f\n", cylinder.getVolume());
    }
}