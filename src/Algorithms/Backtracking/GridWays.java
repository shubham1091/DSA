package Algorithms.Backtracking;

/**
 * This class provides two methods to calculate the number of ways to traverse a grid.
 * One method uses a brute-force recursive approach, and the other uses a combinatorial formula.
 */
public class GridWays {
    public static void main(String[] args) {
        int rows = 3, cols = 3;
        System.out.println(calculateWaysBruteForce(0, 0, rows, cols));
        System.out.println(calculateWaysUsingFormula(rows, cols));
    }

    /**
     * Calculates the number of ways to traverse the grid using a brute-force recursive approach.
     *
     * @param i    Current row index
     * @param j    Current column index
     * @param rows Total number of rows in the grid
     * @param cols Total number of columns in the grid
     * @return Number of ways to reach the bottom-right corner from the top-left corner
     */
    private static int calculateWaysBruteForce(int i, int j, int rows, int cols) {
        if (i == rows - 1 && j == cols - 1) {
            return 1;
        } else if (i == rows || j == cols) {
            return 0;
        }
        int downWays = calculateWaysBruteForce(i + 1, j, rows, cols);
        int rightWays = calculateWaysBruteForce(i, j + 1, rows, cols);
        return downWays + rightWays;
    }

    /**
     * Calculates the number of ways to traverse the grid using a combinatorial formula.
     *
     * @param rows Total number of rows in the grid
     * @param cols Total number of columns in the grid
     * @return Number of ways to reach the bottom-right corner from the top-left corner
     */
    private static int calculateWaysUsingFormula(int rows, int cols) {
        int totalSteps = (rows - 1) + (cols - 1);
        int factorialTotalSteps = factorial(totalSteps);
        int factorialRows = factorial(rows - 1);
        int factorialCols = factorial(cols - 1);
        return factorialTotalSteps / (factorialRows * factorialCols);
    }

    /**
     * Calculates the factorial of a given number.
     *
     * @param n The number to calculate the factorial for
     * @return The factorial of the given number
     */
    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact = 1;
        while (n > 1) {
            fact *= n;
            n--;
        }
        return fact;
    }
}
