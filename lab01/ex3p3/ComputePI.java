package lab01.ex3p3;

public class ComputePI {
    public static void main(String[] args) {
        int MAX_DENOMINATOR = 1000;
        System.out.printf("PI = %f", computePI(MAX_DENOMINATOR));
    }

    public static double computePI(int maxDenominator) {
        double sum = 1.0;
        for (int i = 2; i <= maxDenominator; i++) {
            if (i % 2 == 1) {
                sum += 1.0/(2*i-1);
            } else {
                sum -= 1.0/(2*i-1);
            }
        }
        return 4*sum;
    }
 }
