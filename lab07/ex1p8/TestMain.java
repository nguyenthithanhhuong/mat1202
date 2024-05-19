package lab07.ex1p8;

public class TestMain {
    public static void main(String[] args) {
        testMovablePoint();
        testMovableCircle();
    }

    public static void testMovablePoint() {
        Movable m1 = new MovablePoint(5, 6, 10, 15);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
    }

    public static void testMovableCircle() {
        Movable m2 = new MovableCircle(1, 2, 3, 4, 20);
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);
    }
}