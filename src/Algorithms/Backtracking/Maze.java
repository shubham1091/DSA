package Algorithms.Backtracking;

public class Maze {
    public static void main(String[] args) {
        int[][] maze = {
                { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 }
        };
        solve(maze);

    }

    private static boolean solve(int[][] maze) {
        int N = maze.length;
        int sol[][] = new int[N][N];
        if (!Util(maze, 0, 0, sol)) {
            System.out.println("Solution doesn't exist");
            return false;
        }
        print(sol);
        return true;
    }

    private static boolean Util(int[][] maze, int row, int col, int[][] temp) {
        if (row == maze.length - 1 && col == maze.length - 1 && maze[row][col] == 1) {
            temp[row][col] = 1;
            return true;
        }
        if (isSafe(maze, row, col)) {
            if (temp[row][col] == 1) {
                return false;
            }
            temp[row][col] = 1;
            if (Util(maze, row + 1, col, temp)) {
                return true;
            }
            if (Util(maze, row, col + 1, temp)) {
                return true;
            }
            temp[row][col] = 0;
            return false;
        }
        return false;
    }

    private static boolean isSafe(int[][] maze, int row, int col) {
        return (row >= 0 && row < maze.length && col >= 0 && col < maze.length && maze[row][col] == 1);
    }

    private static void print(int[][] arr) {
        for (int[] row : arr) {
            for (int idx : row) {
                System.out.print(" " + idx + " ");
            }
            System.out.println();
        }
    }

}
