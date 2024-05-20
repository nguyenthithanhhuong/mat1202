package lab12.integration;

public abstract class AbstractPolynomial implements Polynomial {
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        double[] coeffs = coefficients();
        for (int i = 0; i < coeffs.length; i++) {
            if (i == 0) {
                sb.append(coeffs[i]);
            } else {
                sb.append(" + ").append(coeffs[i]).append("x^").append(i);
            }
        }
        return "[" + sb.toString() + "]";
    }

    public double[] differentiate() {
        double[] coeffs = coefficients();
        if (coeffs.length <= 1) {
            return new double[]{0};
        }
        double[] derivativeCoeffs = new double[coeffs.length - 1];
        for (int i = 1; i < coeffs.length; i++) {
            derivativeCoeffs[i - 1] = coeffs[i] * i;
        }
        return derivativeCoeffs;
    }
}
