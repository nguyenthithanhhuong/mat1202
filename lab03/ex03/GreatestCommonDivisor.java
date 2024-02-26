package lab03.ex03;


public class GreatestCommonDivisor {
    public static void main(String[] args) {
        test();
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            System.out.printf(" = %d", a);
            return a;
        }
        System.out.printf(" = GCD(%d,%d)", b, a%b);
        return gcd(b, a%b);
    }

    public static void test() {
        System.out.printf("gcd(%d,%d)", 15, 5);
        gcd(15, 5);
        System.out.printf("\ngcd(%d,%d)", 99, 88);
        gcd(99, 88);
        System.out.printf("\ngcd(%d,%d)", 3456, 1233);
        gcd(3456, 1233);
    }
}

