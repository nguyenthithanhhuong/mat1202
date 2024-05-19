package lab04.ex2p9;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public String toString() {
        return String.format("MyTriangle[v1 = %s, v2 = %s, v3 = %s]", v1, v2, v3);
    }

    public double getPerimeter() {
        double distance12 = v1.distance(v2);
        double distance23 = v2.distance(v3);
        double distance13 = v1.distance(v3);
        return distance12 + distance23 + distance13;
    }

    public String getType() {
        String type = "Regular triangle";

        double distance12 = v1.distance(v2);
        double distance23 = v2.distance(v3);
        double distance13 = v1.distance(v3);

        double squareDistance12 = distance12*distance12;
        double squareDistance23 = distance23*distance23;
        double squareDistance13 = distance13*distance13;

        if (Double.compare(distance12, distance23) == 0
                && Double.compare(distance23, distance13) == 0) {
            type = "equilateral triangle";
        }

        if (Double.compare(distance12, distance23) == 0
                || Double.compare(distance23, distance13) == 0
                || Double.compare(distance13, distance12) == 0) {
            type = "Isosceles triangle";
        }

        if (Double.compare(squareDistance12, (squareDistance23 + squareDistance13)) == 0
                || Double.compare(squareDistance23, (squareDistance12 + squareDistance13)) == 0
                || Double.compare(squareDistance13, (squareDistance12 + squareDistance23)) == 0) {
            type = "Right triangle";
        }
        return type;
    }
}
