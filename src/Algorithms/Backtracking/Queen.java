package Algorithms.Backtracking;

/**
 * The Queen class solves the N-Queens problem using backtracking.
 * It finds all possible ways to place N queens on an N x N chessboard
 * such that no two queens threaten each other.
 */
public class Queen {
    // Counter to keep track of the number of possible solutions
    static int numberOfWays = 0;

    /**
     * The main method initializes the board and starts the N-Queens algorithm.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int n = 4; // Size of the chessboard (N x N)
        char[][] board = initialize(n); // Initialize the board
        nQueens(board, 0); // Start the N-Queens algorithm
        System.out.printf("Number of possible ways: %d\n", numberOfWays); // Print the number of solutions
    }

    /**
     * Initializes the chessboard with 'X' indicating empty cells.
     * @param n Size of the chessboard (N x N).
     * @return A 2D char array representing the initialized chessboard.
     */
    private static char[][] initialize(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X'; // 'X' indicates an empty cell
            }
        }
        return board;
    }

    /**
     * Recursively attempts to place queens on the board.
     * @param board The current state of the chessboard.
     * @param row The current row to place a queen.
     */
    private static void nQueens(char[][] board, int row) {
        // Base case: If all queens are placed, increment the solution count
        if (row == board.length) {
            numberOfWays++;
            // print(board); // Uncomment to print each solution
            return;
        }
        // Try placing a queen in each column of the current row
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) { // Check if it's safe to place a queen
                board[row][col] = 'Q'; // Place the queen
                nQueens(board, row + 1); // Recur to place the rest of the queens
                board[row][col] = 'X'; // Backtrack: Remove the queen
            }
        }
    }

    /**
     * Checks if it's safe to place a queen at board[row][col].
     * @param board The current state of the chessboard.
     * @param row The row index.
     * @param col The column index.
     * @return True if it's safe to place a queen, false otherwise.
     */
    private static boolean isSafe(char[][] board, int row, int col) {
        // Check vertically up and diagonals in a single loop
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q' || 
                (col - (row - i) >= 0 && board[i][col - (row - i)] == 'Q') || 
                (col + (row - i) < board.length && board[i][col + (row - i)] == 'Q')) {
                return false;
            }
        }
        return true;
    }

    /**
     * Prints the current state of the chessboard.
     * @param board The current state of the chessboard.
     */
    @SuppressWarnings("unused")
    private static void print(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println("-----");
    }
}
