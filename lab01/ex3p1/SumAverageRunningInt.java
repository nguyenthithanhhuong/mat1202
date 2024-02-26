package lab01.ex3p1;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        final int LOWER = 1;
        final int UPPER = 100;

        System.out.printf("The sum of %d to %d is %d\n", LOWER, UPPER, sum(LOWER, UPPER));
        System.out.printf("The sum of %d to %d is %.2f", LOWER, UPPER, average(LOWER, UPPER));
    }

    public static int sum(int lower, int upper) {
        int sum = 0;
        for (int i = lower; i <= upper; i++) {
            sum += i;
        }
        return sum;
    }

    public static double average(int lower, int upper) {
        return 1.0*sum(lower, upper)/(upper - lower + 1);
    }
}
