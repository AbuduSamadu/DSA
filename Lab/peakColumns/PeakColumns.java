package Lab.peakColumns;

import java.util.Scanner;

class PeakColumns {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
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
            for (int i = 0; i< rows; i++){
                int j;
                for(j=0 ; j< cols; j++){
                    System.out.print(matrix[i][j] + " ");

                }
                j=0;
                System.out.println(" ");
            }
            // Find and display peak-columns
            findPeakColumns(matrix, rows, cols);

        } catch (Exception e) {
            System.out.println("Invalid input. Please try enter Numbers .");
        } finally {
            scanner.close();
        }
    }

    private static void findPeakColumns(int[][] matrix, int rows, int cols) {
        int peakCounter = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (isPeakColumn(matrix, i, j, rows, cols)) {
                    peakCounter++;
                    System.out.println("(" + (i + 1) + "," + (j + 1) + ") = " + matrix[i][j]);
                }
            }
        }
        if(peakCounter == 0){
            System.out.println("No peak columns found.");
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
