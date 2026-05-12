package LAB2;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // FIRST MATRIX
        System.out.print("Enter number of rows of first matrix: ");
        int r1 = sc.nextInt();
        System.out.print("Enter number of columns of first matrix: ");
        int c1 = sc.nextInt();

        int[][] A = new int[r1][c1];

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // SECOND MATRIX
        System.out.print("\nEnter number of rows of second matrix: ");
        int r2 = sc.nextInt();
        System.out.print("Enter number of columns of second matrix: ");
        int c2 = sc.nextInt();

        int[][] B = new int[r2][c2];

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // DISPLAY MATRICES
        System.out.println("\nFirst Matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nSecond Matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }

        // MATRIX ADDITION
        if (r1 == r2 && c1 == c2) {
            int[][] sum = new int[r1][c1];

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    sum[i][j] = A[i][j] + B[i][j];
                }
            }

            System.out.println("\nMatrix Addition:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print(sum[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("\nMatrix addition not possible (different dimensions)");
        }

        //MATRIX SUBTRACTION
        if (r1 == r2 && c1 == c2) {
            int[][] diff = new int[r1][c1];

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    diff[i][j] = A[i][j] - B[i][j];
                }
            }

            System.out.println("\nMatrix Subtraction (A - B):");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print(diff[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("\nMatrix subtraction not possible (different dimensions)");
        }

        // MATRIX MULTIPLICATION
        if (c1 == r2) {
            int[][] mul = new int[r1][c2];

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    mul[i][j] = 0;
                    for (int k = 0; k < c1; k++) {
                        mul[i][j] += A[i][k] * B[k][j];
                    }
                }
            }

            System.out.println("\nMatrix Multiplication:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(mul[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("\nMatrix multiplication not possible (columns of A must equal rows of B)");
        }

        // TRANSPOSE OF FIRST MATRIX
        int[][] t = new int[c1][r1];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                t[j][i] = A[i][j];
            }
        }

        System.out.println("\nTranspose of First Matrix:");
        for (int i = 0; i < c1; i++) {
            for (int j = 0; j < r1; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }
}
