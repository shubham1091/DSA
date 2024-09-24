package Algorithms.Backtracking;

public class Knights {
    static int N = 8;

    public static void main(String[] args) {
        solveKT();
    }

    /**
     * This function initializes the solution matrix and starts the Knight's Tour
     * backtracking process.
     * 
     * @return true if a solution exists, false otherwise.
     */
    private static boolean solveKT() {
        int[][] sol = new int[N][N];

        // Initialize the solution matrix with -1
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                sol[x][y] = -1;
            }
        }

        // xMove[] and yMove[] define the next move of the Knight
        int[] xMove = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int[] yMove = { 1, 2, 2, 1, -1, -2, -2, -1 };

        // The Knight is initially at the first block
        sol[0][0] = 0;

        // Start the backtracking process from the first block
        if (!solveKTUtil(0, 0, 1, sol, xMove, yMove)) {
            System.out.println("Solution does not exist");
            return false;
        } else {
            printSolution(sol);
        }
        return true;
    }

    /**
     * This function uses backtracking to solve the Knight's Tour problem.
     * 
     * @param x      Current x coordinate of the Knight.
     * @param y      Current y coordinate of the Knight.
     * @param movei  Current move number.
     * @param sol    Solution matrix.
     * @param xMove  Possible x moves for the Knight.
     * @param yMove  Possible y moves for the Knight.
     * @return true if a solution is found, false otherwise.
     */
    private static boolean solveKTUtil(int x, int y, int movei, int[][] sol, int[] xMove, int[] yMove) {
        int next_x, next_y;
        if (movei == N * N) {
            return true;
        }

        // Try all next moves from the current coordinate x, y
        for (int k = 0; k < 8; k++) {
            next_x = x + xMove[k];
            next_y = y + yMove[k];

            if (isSafe(next_x, next_y, sol)) {
                sol[next_x][next_y] = movei;
                if (solveKTUtil(next_x, next_y, movei + 1, sol, xMove, yMove)) {
                    return true;
                } else {
                    sol[next_x][next_y] = -1; // Backtrack
                }
            }
        }
        return false;
    }

    /**
     * This function checks if the move is valid.
     * 
     * @param x   x coordinate.
     * @param y   y coordinate.
     * @param sol Solution matrix.
     * @return true if the move is valid, false otherwise.
     */
    private static boolean isSafe(int x, int y, int[][] sol) {
        return (x >= 0 && x < N && y >= 0 && y < N && sol[x][y] == -1);
    }

    /**
     * This function prints the solution matrix.
     * 
     * @param sol Solution matrix.
     */
    private static void printSolution(int[][] sol) {
        for (int[] row : sol) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
