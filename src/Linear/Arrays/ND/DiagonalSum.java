package Linear.Arrays.ND;

public class DiagonalSum {
    public static void main(String[] args) {

        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        System.out.println(Sum(matrix));
    }

    public static int SumBruteForce(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    sum += matrix[i][j];

                } else if (i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }

        return sum;
    }

    public static int Sum(int[][] matrix) {
        int sum = 0;
        int length = matrix.length;
        for (int i = 0; i < length; i++) {
            sum += matrix[i][i];
            
            int j = length - i - 1;
            if (j != i) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }
}
