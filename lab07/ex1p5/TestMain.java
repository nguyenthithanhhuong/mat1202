package lab07.ex1p5;

public class TestMain {
    public static void main(String[] args) {
        testResizableCircle();
    }

    public static void testResizableCircle() {
        ResizableCircle resizableCircle = new ResizableCircle(2.0);
        System.out.println(resizableCircle.toString());

        System.out.printf("Test getArea(): %.2f\n", resizableCircle.getArea());

        System.out.printf("Test getPerimeter(): %.2f\n", resizableCircle.getPerimeter());

        resizableCircle.resize(20);
        System.out.printf("Test resize(): %s", resizableCircle.toString());
    }
}
