package lab12.integration;

public class SimpsonRule implements Integrator {
    private double precision;
    private int maxIterations;

    public SimpsonRule(double precision, int maxIterations) {
        this.precision = precision;
        this.maxIterations = maxIterations;
    }

    @Override
    public double integrate(Polynomial poly, double lower, double upper) {
        int n0 = 2;
        double currentApproximation, previousApproximation;
        int iteration = 0;

        do {
            previousApproximation = integrate(poly, lower, upper, n0);
            n0 *= 2;
            currentApproximation = integrate(poly, lower, upper, n0);
            iteration++;
        } while (Math.abs(currentApproximation - previousApproximation) / 3 >= precision && iteration <= maxIterations);

        return currentApproximation;
    }

    private double integrate(Polynomial poly, double lower, double upper, int numOfSubIntervals) {
        if (numOfSubIntervals % 2 != 0) {
            throw new IllegalArgumentException("Number of sub-intervals must be even.");
        }

        double h = (upper - lower) / numOfSubIntervals;
        double sum = poly.evaluate(lower) + poly.evaluate(upper);

        for (int i = 1; i < numOfSubIntervals; i++) {
            if (i % 2 == 0) {
                sum += 2 * poly.evaluate(lower + i * h);
            } else {
                sum += 4 * poly.evaluate(lower + i * h);
            }
        }

        return (h / 3) * sum;
    }
}
