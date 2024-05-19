package lab07.ex1p4;

public class TestMain {
    public static void main(String[] args) {
        testMovableCircle();
    }

    public static void testMovableCircle() {
        MovableCircle movableCircle = new MovableCircle(18, 12, 2, 2, 4);
        System.out.println(movableCircle.toString());

        movableCircle.moveUp();
        System.out.printf("MovableCircle after moveUp(): %s\n",
                movableCircle.toString());

        movableCircle.moveDown();
        System.out.printf("MovableCircle after moveDown(): %s\n",
                movableCircle.toString());

        movableCircle.moveLeft();
        System.out.printf("MovableCircle after moveLeft(): %s\n",
                movableCircle.toString());

        movableCircle.moveRight();
        System.out.printf("MovableCircle after moveRight(): %s\n",
                movableCircle.toString());
    }
}
