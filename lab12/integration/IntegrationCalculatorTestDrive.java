package lab12.integration;

public class IntegrationCalculatorTestDrive {
    public static void main(String[] args) {
        testArrayPolynomial();
        testListPolynomial();
        testIntegrationCalculator();
    }

    public static void testArrayPolynomial() {
        ArrayPolynomial poly1 = new ArrayPolynomial();
        poly1.append(3).append(2).append(1); // 3 + 2x + x^2

        ArrayPolynomial poly2 = new ArrayPolynomial();
        poly2.append(1).append(2).append(3); // 1 + 2x + 3x^2

        System.out.println("Polynomial 1: " + poly1);
        System.out.println("Polynomial 2: " + poly2);

        ArrayPolynomial sum = poly1.plus(poly2);
        System.out.println("Sum: " + sum);

        ArrayPolynomial diff = poly1.minus(poly2);
        System.out.println("Difference: " + diff);

        ArrayPolynomial product = poly1.multiply(poly2);
        System.out.println("Product: " + product);

        double value = poly1.evaluate(2);
        System.out.println("Value of Polynomial 1 at x=2: " + value);

        Polynomial derivative = poly1.derivative();
        System.out.println("Derivative of Polynomial 1: " + derivative);
    }

    public static void testListPolynomial() {
        ListPolynomial poly1 = new ListPolynomial();
        poly1.append(3).append(2).append(1); // 3 + 2x + x^2

        ListPolynomial poly2 = new ListPolynomial();
        poly2.append(1).append(2).append(3); // 1 + 2x + 3x^2

        System.out.println("Polynomial 1: " + poly1);
        System.out.println("Polynomial 2: " + poly2);

        ListPolynomial sum = poly1.plus(poly2);
        System.out.println("Sum: " + sum);

        ListPolynomial diff = poly1.minus(poly2);
        System.out.println("Difference: " + diff);

        ListPolynomial product = poly1.multiply(poly2);
        System.out.println("Product: " + product);

        double value = poly1.evaluate(2);
        System.out.println("Value of Polynomial 1 at x=2: " + value);

        Polynomial derivative = poly1.derivative();
        System.out.println("Derivative of Polynomial 1: " + derivative);
    }

    public static void testIntegrationCalculator() {
        Polynomial poly = new ArrayPolynomial().append(3).append(2).append(1); // 3 + 2x + x^2

        IntegrationCalculator calculator = new IntegrationCalculator(poly);

        calculator.setIntegrator(new MidpointRule(1e-6, 1000));
        double midpointResult = calculator.integrate(0, 1);
        System.out.println("Midpoint Rule: " + midpointResult);

        calculator.setIntegrator(new TrapezoidRule(1e-6, 1000));
        double trapezoidResult = calculator.integrate(0, 1);
        System.out.println("Trapezoid Rule: " + trapezoidResult);

        calculator.setIntegrator(new SimpsonRule(1e-6, 1000));
        double simpsonResult = calculator.integrate(0, 1);
        System.out.println("Simpson Rule: " + simpsonResult);
    }
}
