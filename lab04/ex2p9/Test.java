package lab04.ex2p9;

public class Test {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        MyPoint v1 = new MyPoint(1, 1);
        MyPoint v2 = new MyPoint(2, 2);
        MyPoint v3 = new MyPoint(0, 3);

        MyTriangle triangle = new MyTriangle(v1, v2, v3);

        System.out.println("1. Test constructor and toString():");
        System.out.println(triangle.toString());

        System.out.println("2. Test getPerimeter():");
        System.out.println(triangle.getPerimeter());

        System.out.println("3. Test getType():");
        System.out.println(triangle.getType());
    }
}
