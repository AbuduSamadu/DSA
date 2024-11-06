
import java.util.Scanner;

class PeakColumns {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read matrix dimensions
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Initialize the matrix
        int[][] matrix = new int[rows][cols];

        // Read matrix elements
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Find and display peak-columns
        findPeakColumns(matrix, rows, cols);
    }

    private static void findPeakColumns(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (isPeakColumn(matrix, i, j, rows, cols)) {
                    System.out.println("(" + (i + 1) + "," + (j + 1) + ") = " + matrix[i][j]);
                }
            }
        }
    }

    private static boolean isPeakColumn(int[][] matrix, int row, int col, int rows, int cols) {
        int value = matrix[row][col];

        // Check if it's the maximum in its row
        for (int j = 0; j < cols; j++) {
            if (matrix[row][j] > value) {
                return false;
            }
        }

        // Check if it's the minimum in its column
        for (int i = 0; i < rows; i++) {
            if (matrix[i][col] < value) {
                return false;
            }
        }

        return true;
    }
}
