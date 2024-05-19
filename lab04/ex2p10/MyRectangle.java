package lab04.ex2p10;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public String toString() {
        return String.format("MyRectangle[topLeft = %s, bottomRight = %s]", topLeft, bottomRight);
    }

    public int getWidth() {
        int bottomLeftX = topLeft.getX();
        int bottomLeftY = bottomRight.getY();
        MyPoint bottomLeft = new MyPoint(bottomLeftX, bottomLeftY);

        int distanceTopBottomLeft = (int) topLeft.distance(bottomLeft);
        int distanceBottomLeftRight = (int) bottomLeft.distance(bottomRight);

        if (Double.compare(distanceBottomLeftRight, distanceTopBottomLeft) < 0) return distanceBottomLeftRight;
        return distanceTopBottomLeft;
    }

    public int getHeight() {
        int bottomLeftX = topLeft.getX();
        int bottomLeftY = bottomRight.getY();
        MyPoint bottomLeft = new MyPoint(bottomLeftX, bottomLeftY);

        int distanceTopBottomLeft = (int) topLeft.distance(bottomLeft);
        int distanceBottomLeftRight = (int) bottomLeft.distance(bottomRight);

        if (Double.compare(distanceBottomLeftRight, distanceTopBottomLeft) > 0) return distanceBottomLeftRight;
        return distanceTopBottomLeft;
    }

    public int getPerimeter() {
        return 2 * (this.getHeight() + this.getWidth());
    }

    public int getArea() {
        return this.getHeight() * this.getWidth();
    }
}
