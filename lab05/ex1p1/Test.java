package lab05.ex1p1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter complex number 1 (real and imaginary part): ");
        MyComplex complex1 = new MyComplex(sc.nextDouble(), sc.nextDouble());
        System.out.print("Enter complex number 2 (real and imaginary part): ");
        MyComplex complex2 = new MyComplex(sc.nextDouble(), sc.nextDouble());
        sc.close();

        printComplex(1, complex1);
        printComplex(2, complex2);
        compareComplex(complex1, complex2);
        addComplex(complex1, complex2);
    }

    public static void printComplex(int complexIdx, MyComplex complex) {
        System.out.printf("Number %d is: (%s).%n", complexIdx, complex);
        boolean isReal = complex.isReal();
        System.out.printf("(%s) is%s a pure real number%n", complex, isReal? " " : " NOT");
        boolean isImag = complex.isImaginary();
        System.out.printf("(%s) is%s a pure imaginary number%n", complex, isImag? " " : " NOT");
    }

    public static void compareComplex(MyComplex complex1, MyComplex complex2) {
        boolean isEqual =  complex1.equals(complex2);
        System.out.printf("(%s) is%s equal to (%s)%n", complex1, isEqual? " " : " NOT", complex2);
    }

    public static void addComplex(MyComplex complex1, MyComplex complex2) {
        MyComplex sumOfTwoComplex = complex1.addNew(complex2);
        System.out.printf("(%s) + (%s) = (%s)%n",
                complex1, complex2, sumOfTwoComplex);
    }
}
