package Linear.Arrays.ND;

import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] transpose = convert(matrix);

        System.out.println(Arrays.deepToString(transpose));
    }

    private static int[][] convert(int[][] matrix) {
        int[][] transpose = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
}
