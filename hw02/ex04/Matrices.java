package hw02.ex04;

public class Matrices {
    public static void main(String[] args) {
        test01();
        test02();
    }
    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void print(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean haveSameDimension(int[][] matrix1,
                                            int[][] matrix2) {
        int row01 = matrix1.length;
        int col01 = matrix1[0].length;
        int row02 = matrix2.length;
        int col02 = matrix2[0].length;

        return row01 == row02 && col01 == col02;
    }

    public static boolean haveSameDimension(double[][] matrix1,
                                            double[][] matrix2) {
        int row01 = matrix1.length;
        int col01 = matrix1[0].length;
        int row02 = matrix2.length;
        int col02 = matrix2[0].length;

        return row01 == row02 && col01 == col02;
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        if (!haveSameDimension(matrix1, matrix2)) {
            throw new IllegalArgumentException("Matrices don't have same dimension");
        }

        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) {
        if (!haveSameDimension(matrix1, matrix2)) {
            throw new IllegalArgumentException("Matrices don't have same dimension");
        }

        int rows = matrix1.length;
        int cols = matrix1[0].length;
        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        if (!haveSameDimension(matrix1, matrix2)) {
            throw new IllegalArgumentException("Matrices don't have same dimension");
        }

        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return result;
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        if (!haveSameDimension(matrix1, matrix2)) {
            throw new IllegalArgumentException("Matrices don't have same dimension");
        }

        int rows = matrix1.length;
        int cols = matrix1[0].length;
        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return result;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int row01 = matrix1.length;
        int col01 = matrix1[0].length;
        int row02 = matrix2.length;
        int col02 = matrix2[0].length;

        if (col01 != row02) {
            throw new IllegalArgumentException("Can't multiply");
        }

        int[][] result = new int[row01][col02];

        for (int i = 0; i < row01; i++) {
            for (int j = 0; j < col02; j++) {
                for (int k = 0; k < col01; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        int row01 = matrix1.length;
        int col01 = matrix1[0].length;
        int row02 = matrix2.length;
        int col02 = matrix2[0].length;

        if (col01 != row02) {
            throw new IllegalArgumentException("Can't multiply");
        }

        double[][] result = new double[row01][col02];

        for (int i = 0; i < row01; i++) {
            for (int j = 0; j < col02; j++) {
                for (int k = 0; k < col01; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    public static void test01() {
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{5, 6}, {7, 8}};

        System.out.println("1. Test int[][] matrix:");
        System.out.println("Matrix 1:");
        print(matrix1);
        System.out.println("Matrix 2:");
        print(matrix2);

        System.out.println("+ Test haveSameDimension():");
        System.out.println(haveSameDimension(matrix1, matrix2));
        System.out.println("+ Test add():");
        print(add(matrix1, matrix2));
        System.out.println("+ Test subtract:");
        print(subtract(matrix1, matrix2));
        System.out.println("+ Test multiply():");
        print(multiply(matrix1, matrix2));
    }

    public static void test02() {
        double[][] matrix1 = {{1.2, 2.3}, {3.4, 4.5}};
        double[][] matrix2 = {{5.6, 6.7}, {7.8, 8.9}};

        System.out.println("1. Test double[][] matrix:");
        System.out.println("Matrix 1:");
        print(matrix1);
        System.out.println("Matrix 2:");
        print(matrix2);

        System.out.println("+ Test haveSameDimension():");
        System.out.println(haveSameDimension(matrix1, matrix2));
        System.out.println("+ Test add():");
        print(add(matrix1, matrix2));
        System.out.println("+ Test subtract:");
        print(subtract(matrix1, matrix2));
        System.out.println("+ Test multiply():");
        print(multiply(matrix1, matrix2));
    }

}
