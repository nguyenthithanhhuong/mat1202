package lab05.ex1p6;

public class Container {
    private int x1, y1, x2, y2;

    public Container(int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x1 + width;
        this.y2 = y1 - height;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return x2 - x1;
    }

    public int getHeight() {
        return y2 + y1;
    }

    public boolean collides(Ball ball) {
        if ((ball.getX() - ball.getRadius() <= this.x1) ||
            (ball.getX() - ball.getRadius() >= this.x2)) {
            ball.reflectHorizontal();
            return true;
        }
        ball.reflectVertical();
        return true;
    }

    public String toString() {
        return String.format("Container[(%d,%d),(%d,%d)]",
                            x1, y1, x2, y2);
    }
}
