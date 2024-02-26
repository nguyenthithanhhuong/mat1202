package lab01.ex4p2;

import java.util.Scanner;

public class CircleComputation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = sc.nextDouble();
        sc.close();

        double diameter = 2.0*radius;
        double area = Math.PI*radius*radius;
        double circumference = 2.0*Math.PI*radius;

        System.out.printf("Diameter is: %f\n", diameter);
        System.out.printf("Area is: %f\n", area);
        System.out.printf("Circumference is: %f", circumference);
    }
}
