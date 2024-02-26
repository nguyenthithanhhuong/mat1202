package hw02.ex05;

public class TrigonometricSeries {
    public static void main(String[] args) {
        test();
    }

    public static double sin(double x, int numTerms) {
        double result = 0.0;
        int sign = 1;
        for (int i = 1; i <= numTerms; i += 2) {
            result += sign * Math.pow(x, i) / factorial(i);
            sign *= -1;
        }
        return result;
    }

    public static double cos(double x, int numTerms) {
        double result = 1.0;
        int sign = -1;
        for (int i = 2; i <= numTerms; i += 2) {
            result += sign * Math.pow(x, i) / factorial(i);
            sign *= -1;
        }
        return result;
    }

    private static long factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void test() {
        double x = Math.PI / 4;
        int numTerms = 10;

        System.out.println("Input: x = " + x + ", numTerms = " + numTerms);

        System.out.println("Calculate sin(x):");
        double sinResult = sin(x, numTerms);
        System.out.println("Use sin(x, numTerms): " + sinResult);
        System.out.println("Use Math.sin(x): " + Math.sin(x));

        System.out.println("Calculate cos(x):");
        double cosResult = cos(x, numTerms);
        System.out.println("Use cos(x, numTerms): " + cosResult);
        System.out.println("Use Math.cos(x): " + Math.cos(x));
    }
}
