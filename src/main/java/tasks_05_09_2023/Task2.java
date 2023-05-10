package tasks_05_09_2023;

/** Input:
 * [1 2 3]
 * [4 5 6]
 * Output:
 * [1 4]
 * [2 5]
 * [3 6]
 * Input:
 * [1 2 3]
 * [4 5 6]
 * [7 8 9]
 * Output:
 * [1 4 7]
 * [2 5 8]
 * [3 6 9]
 */

public class Task2 {
    private static int[][] turns(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] turned = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                turned[j][i] = matrix[i][j];
            }
        }
        return turned;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] turned1 = turns(matrix1);
        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] turned2 = turns(matrix2);

        for (int i = 0; i < turned1.length; i++) {
            for (int j = 0; j < turned1[0].length; j++) {
                System.out.print(turned1[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < turned2.length; i++) {
            for (int j = 0; j < turned2[0].length; j++) {
                System.out.print(turned2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
