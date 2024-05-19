package lab07.ex1p3;

public class TestMain {
    public static void main(String[] args) {
        testMovablePoint();
    }

    public static void testMovablePoint() {
        MovablePoint movablePoint = new MovablePoint(18, 12, 4, 1);
        System.out.println(movablePoint.toString());

        movablePoint.moveUp();
        System.out.printf("MovablePoint after moveUp(): %s\n",
                          movablePoint.toString());

        movablePoint.moveDown();
        System.out.printf("MovablePoint after moveDown(): %s\n",
                movablePoint.toString());

        movablePoint.moveLeft();
        System.out.printf("MovablePoint after moveLeft(): %s\n",
                movablePoint.toString());

        movablePoint.moveRight();
        System.out.printf("MovablePoint after moveRight(): %s\n",
                movablePoint.toString());
    }
}
