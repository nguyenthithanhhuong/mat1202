package lab04.ex2p6;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        return new int[] {x, y};
    }

    public void setXY(int x, int y) {
        setX(x);
        setY(y);
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    public double distance(int x, int y) {
        int d_x = this.x - x;
        int d_y = this.y - y;
        return Math.sqrt(d_x * d_x + d_y * d_y);
    }

    public double distance(MyPoint another) {
        return distance(another.getX(), another.getY());
    }

    public double distance() {
        return distance(0, 0);
    }
}
