package lab03.ex01;

public class GCD {
    public static void main(String[] args) {
        test();
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void test() {
        int num1 = 48;
        int num2 = 18;
        int result = gcd(num1, num2);
        System.out.printf("GCD of %d and %d is: %d", num1, num2, result);
    }
}
