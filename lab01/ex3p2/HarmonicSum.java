package lab01.ex3p2;

public class HarmonicSum {
    public static void main(String[] args) {
        final int MAX_DENOMINATOR = 50000;
        double sumL2R = sumL2R(MAX_DENOMINATOR);
        double sumR2L = sumR2L(MAX_DENOMINATOR);
        double absDiff = Math.abs(sumL2R - sumR2L);

        System.out.println("Sum from left-to-right: " + sumL2R);
        System.out.println("Sum from right-to-left: " + sumR2L);
        System.out.println("Absolute difference: " + absDiff);
    }

    public static double sumL2R(int maxDenominator) {
        double sum = 1.0;
        for (int i = 2; i <= maxDenominator; i++) {
            sum += (1.0/i);
        }
        return sum;
    }

    public static double sumR2L(int maxDenominator) {
        double sum = 1.0;
        for (int i = maxDenominator; i >= 2; i--) {
            sum += (1.0/i);
        }
        return sum;
    }
}
