package lab02.ex2p2;

import java.util.Scanner;

public class GradesStatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of student: ");
        int numStudents = sc.nextInt();
        int[] grades = new int[numStudents];
        if (grades.length > 0) {
            for (int i = 0; i < grades.length; ++i) {
                System.out.printf("Enter the grades for student %d: ", (i + 1));
                grades[i] = sc.nextInt();
            }
        }

        if (checkArr(grades)) {
            System.out.printf("The average is: %.2f\n", average(grades));
            System.out.printf("The minimum is: %d\n", min(grades));
            System.out.printf("The maximum is: %d", max(grades));
        }
    }

    public static double average(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (sum*1.0/(arr.length));
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static boolean checkArr(int[] arr) {
        int count = 0;
        boolean result = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 || arr[i] > 100) {
                count++;
            }
        }
        if (count == 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}