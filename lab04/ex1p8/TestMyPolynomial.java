package lab04.ex1p8;

public class TestMyPolynomial {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        System.out.println("1. Test constructors and toString():");
        MyPolynomial polynomial1 = new MyPolynomial(1, 2);
        MyPolynomial polynomial2 = new MyPolynomial(1, 2, 3);
        System.out.println(polynomial1);
        System.out.println(polynomial2);

        System.out.println("2. Test evaluate(): ");
        System.out.println(polynomial1.evaluate(2));

        System.out.println("3. Test add():");
        System.out.println(polynomial1.add(polynomial2));

        System.out.println("4. Test multiply():");
        System.out.println(polynomial1.multiply(polynomial2));
    }
}
