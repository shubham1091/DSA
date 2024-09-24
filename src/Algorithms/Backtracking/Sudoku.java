package Algorithms.Backtracking;

public class Sudoku {
    public static void main(String[] args) {
        int[][] sudoku = {
                { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 } };

        print(sudoku);
        System.out.println(solver(sudoku, 0, 0));
        print(sudoku);
    }

    private static boolean solver(int[][] sudoku, int row, int col) {
        if (row == 9 && col == 0) {
            return true;
        }
        int nextRow = row, nextCol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }
        if (sudoku[row][col] != 0) {
            return solver(sudoku, nextRow, nextCol);
        }
        for (int digit = 1; digit < 10; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (solver(sudoku, nextRow, nextCol)) {
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }

    private static boolean isSafe(int[][] sudoku, int row, int col, int val) {
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == val) {
                return false;
            }
        }

        for (int i = 0; i < 9; i++) {
            if (sudoku[row][i] == val) {
                return false;
            }
        }

        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (sudoku[i][j] == val) {
                    return false;
                }
            }
        }

        return true;
    }

    private static void print(int[][] sudoku) {
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println("------+-------+------");
            }
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0 && j != 0) {
                    System.out.print("| ");
                }
                System.out.print(sudoku[i][j] == 0 ? ". " : sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }
}
