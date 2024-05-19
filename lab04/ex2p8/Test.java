package lab04.ex2p8;

public class Test {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        MyPoint point = new MyPoint(1, 1);
        int radius = 2;
        MyCircle circle = new MyCircle(point, radius);

        System.out.println("1. Test constructor and toString():");
        System.out.println(circle.toString());

        System.out.println("2. Test getArea():");
        System.out.println(circle.getArea());

        System.out.println("3. Test getCircumference():");
        System.out.println(circle.getCircumference());

        System.out.println("4. Test distance():");
        MyCircle otherCircle = new MyCircle(0, 1, 3);
        System.out.println("otherCircle = " + otherCircle.toString());
        System.out.println("distance(otherCircle): " + circle.distance(otherCircle));
    }
}
