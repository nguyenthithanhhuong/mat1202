package lab12.integration;

public class TrapezoidRule implements Integrator {
    private double precision;
    private int maxIterations;

    public TrapezoidRule(double precision, int maxIterations) {
        this.precision = precision;
        this.maxIterations = maxIterations;
    }

    @Override
    public double integrate(Polynomial poly, double lower, double upper) {
        int n0 = 1;
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
        double h = (upper - lower) / numOfSubIntervals;
        double sum = 0.5 * (poly.evaluate(lower) + poly.evaluate(upper));

        for (int i = 1; i < numOfSubIntervals; i++) {
            sum += poly.evaluate(lower + i * h);
        }

        return sum * h;
    }
}
