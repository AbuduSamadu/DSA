
import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input Matrix A
            int[][] matrixA = inputMatrix(scanner, "A");

            // Input Matrix B
            int[][] matrixB = inputMatrix(scanner, "B");

            // Validate that matrix dimensions are compatible
            if (matrixA[0].length != matrixB.length) {
                System.out
                        .println("Error: The number of columns in Matrix A must equal the number of rows in Matrix B.");
                return;
            }

            // Perform matrix multiplication
            int[][] matrixC = multiplyMatrices(matrixA, matrixB);

            // Display the result
            displayMatrix(matrixC, "C");

        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter numbers only.");
        } finally {
            scanner.close();
        }
    }

    // Method to input matrix from user
    public static int[][] inputMatrix(Scanner scanner, String matrixName) {
        System.out.println("Enter dimensions of Matrix " + matrixName + " (rows columns):");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements of Matrix " + matrixName + ":");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }


    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int n = matrixA.length;
        int m = matrixA[0].length;
        int p = matrixB[0].length;
        int[][] matrixC = new int[n][p];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                matrixC[i][j] = 0;
                for (int k = 0; k < m; k++) {
                    matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return matrixC;
    }

    // Method to display matrix
    public static void displayMatrix(int[][] matrix, String matrixName) {
        System.out.println("Matrix " + matrixName + ":");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}
