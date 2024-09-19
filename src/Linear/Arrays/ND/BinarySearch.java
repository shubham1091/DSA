package Linear.Arrays.ND;

public class BinarySearch {
    public static void main(String[] args) {
        int[][] matrix = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };

        // System.out.println(SearchBruteForce(matrix, 33));
        System.out.println(StaircaseSearch(matrix, 33));

    }

    public static boolean SearchBruteForce(int[][] matrix, int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == key) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean StaircaseSearch(int[][] matrix, int key) {
        int row = 0, col = matrix[0].length-1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                return true;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}
