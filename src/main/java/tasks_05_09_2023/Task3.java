package tasks_05_09_2023;

/** Input:
 * [1 2 3]
 * [4 5 6]
 * [7 8 9]
 * Output:
 * [7 4 1]
 * [8 5 2]
 * [9 6 3]
 */

public class Task3 {
    private static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }


    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] transposed = transpose(matrix);
        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[0].length; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }
}
