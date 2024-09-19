package Linear.Arrays.ND;

import java.util.Scanner;
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        System.out.println(Arrays.deepToString(matrix));
        System.out.print("Enter key to search: ");
        int key = sc.nextInt();

        if (search(matrix, key)) {
            System.out.println("Key found");
        } else {
            System.out.println("Key not found");
        }

        sc.close();
    }

    public static boolean search(int[][] matrix, int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == key) {
                    return true;
                }
            }
        }
        return false;
    }
}
