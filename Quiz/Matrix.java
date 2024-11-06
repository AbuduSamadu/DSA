package Quiz;

public class Matrix {

    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    public void printDiagonalElements() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.printDiagonalElements();
    }
}
