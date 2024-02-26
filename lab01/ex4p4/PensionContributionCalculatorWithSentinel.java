package lab01.ex4p4;

import java.util.Scanner;

public class PensionContributionCalculatorWithSentinel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the monthly salary (or -1 to end): $");
        int monthlySalary = sc.nextInt();

        double employeeRate, employerRate;
        double employeeContribution = 0;
        double employerContribution = 0;
        double totalContribution = 0;

        while (monthlySalary != -1) {
            System.out.print("Enter the age: ");
            int age = sc.nextInt();

            if (age <= 55) {
                employeeRate = 0.2;
                employerRate = 0.17;
            } else if (age <= 60) {
                employeeRate = 0.13;
                employerRate = 0.13;
            } else if (age <= 65) {
                employeeRate = 0.075;
                employerRate = 0.09;
            } else {
                employeeRate = 0.05;
                employerRate = 0.075;
            }

            employeeContribution = monthlySalary*employeeRate;
            employerContribution = monthlySalary*employerRate;
            totalContribution = employeeContribution + employerContribution;

            System.out.printf("The employee's contribution is: $%.2f%n", employeeContribution);
            System.out.printf("The employer's contribution is: $%.2f%n", employerContribution );
            System.out.printf("The total contribution is: $%.2f%n", totalContribution);

            System.out.println();
            System.out.print("Enter the monthly salary (or -1 to end): $");
            monthlySalary = sc.nextInt();
        }
        sc.close();
        System.out.println("Bye!");
    }
}