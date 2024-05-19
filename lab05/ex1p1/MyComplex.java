package lab05.ex1p1;

public class MyComplex {
    private double real;
    private double imag;

    public MyComplex() {
        real = 0.0;
        imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public String toString() {
        return String.format("%s+%si", real, imag);
    }

    public boolean isReal() {
        return Double.compare(imag, 0.0) == 0;
    }

    public boolean isImaginary() {
        return Double.compare(real, 0.0) == 0;
    }

    public boolean equals(double real, double imag) {
        return (Double.compare(this.real, real) == 0
                && Double.compare(this.imag, imag) == 0);
    }

    public boolean equals(MyComplex another) {
        return (Double.compare(this.real, another.getReal()) == 0
                && Double.compare(this.imag, another.getImag()) == 0);
    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    public MyComplex addInto(MyComplex right) {
        this.real += right.getReal();
        this.imag += right.getImag();
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        MyComplex newComplex = new MyComplex(this.real, this.imag);
        newComplex.real += right.getReal();
        newComplex.imag += right.getImag();
        return newComplex;
    }
}