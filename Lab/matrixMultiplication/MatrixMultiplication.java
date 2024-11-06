
import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input Matrix A dimensions and elements
            System.out.println("Enter dimensions of Matrix A (rows columns):");
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[][] matrixA = new int[n][m];
            System.out.println("Enter elements of Matrix A:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrixA[i][j] = scanner.nextInt();
                }
            }

            // Input Matrix B dimensions and elements
            System.out.println("Enter dimensions of Matrix B (rows columns):");
            int m2 = scanner.nextInt();
            int p = scanner.nextInt();

            // Validate that matrix dimensions are compatible
            if (m != m2) {
                System.out.println("Error: The number of columns in Matrix A must equal the number of rows in Matrix B.");
                return;
            }

            int[][] matrixB = new int[m][p];
            System.out.println("Enter elements of Matrix B:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < p; j++) {
                    matrixB[i][j] = scanner.nextInt();
                }
            }

            // Perform matrix multiplication
            int[][] matrixC = new int[n][p];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < p; j++) {
                    matrixC[i][j] = 0;
                    for (int k = 0; k < m; k++) {
                        matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
                    }
                }
            }

            // Display the result in a formatted way
            System.out.println("Matrix C:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < p; j++) {
                    System.out.print(matrixC[i][j] + "\t");
                }
                System.out.println();
            }

        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter numbers only.");
        } finally {
            scanner.close();
        }
    }
}
