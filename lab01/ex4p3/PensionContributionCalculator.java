package lab01.ex4p3;

import java.util.Scanner;

public class PensionContributionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the monthly salary: $");
        int monthlySalary = sc.nextInt();
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        sc.close();

        double employeeRate, employerRate;
        double employeeContribution = 0;
        double employerContribution = 0;
        double totalContribution = 0;

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

        employeeContribution = monthlySalary * employeeRate;
        employerContribution = monthlySalary * employerRate;
        totalContribution = employeeContribution + employerContribution;

        System.out.printf("The employee's contribution is: $%.2f%n", employeeContribution);
        System.out.printf("The employer's contribution is: $%.2f%n", employerContribution);
        System.out.printf("The total contribution is: $%.2f%n", totalContribution);
    }
}