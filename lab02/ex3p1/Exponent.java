package lab02.ex3p1;

public class Exponent {
    public static void main(String[] args) {
        test();
    }

    public static int exponent(int base, int exp) {
        int result = base;
        for (int i = 0; i < exp - 1; i++) {
            result *= base;
        }
        return result;
    }

    public static void test() {
        int base = 3;
        int exp = 4;
        System.out.println("The base: " + base);
        System.out.println("The exp: " + exp);
        System.out.printf("%d raises to the power of %d is: %d", base, exp, exponent(base, exp));
    }
}
