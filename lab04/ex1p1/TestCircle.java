package lab04.ex1p1;

public class TestCircle {
    public static void main(String[] args) {
       test();
    }

    public static void test() {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2.0, "pink");
        System.out.println(circle1);
        System.out.println(circle2);
    }
}
