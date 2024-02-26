package hw02.ex05;

public class ExponentialSeries {
    public static void main(String[] args) {
        test();
    }

    public static double specialSeries(double x, int numTerms) {
        double sum = 0;
        double term = 1;
        int denominator = 2;

        for (int i = 1; i <= numTerms; i++) {
            sum += term;
            term *= (i % 2 == 0) ? x : (i * 2 - 1);
            term /= denominator;
            denominator += 2;
        }

        return sum;
    }

    public static void test() {
        double x = 0.5;
        int numTerms = 3;

        double result = specialSeries(x, numTerms);
        System.out.println("Special series sum for x = " + x + " with " + numTerms + " terms: " + result);
    }
}
