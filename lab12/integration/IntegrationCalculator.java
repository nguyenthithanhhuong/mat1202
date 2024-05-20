package lab12.integration;

public class IntegrationCalculator {
    private Integrator integrator;
    private Polynomial poly;

    public IntegrationCalculator(Polynomial poly) {
        this.poly = poly;
    }

    public IntegrationCalculator(Integrator integrator, Polynomial poly) {
        this.integrator = integrator;
        this.poly = poly;
    }

    public void setPoly(Polynomial poly) {
        this.poly = poly;
    }

    public void setIntegrator(Integrator integrator) {
        this.integrator = integrator;
    }

    public double integrate(double lower, double upper) {
        if (integrator == null || poly == null) {
            throw new IllegalStateException("Integrator and polynomial must be set.");
        }
        return integrator.integrate(poly, lower, upper);
    }
}
