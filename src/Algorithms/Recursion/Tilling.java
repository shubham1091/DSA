package Algorithms.Recursion;

import java.util.Scanner;

public class Tilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        System.out.printf("Number of wayt to tile the flore: %d\n", ways(n));
        sc.close();
    }

    // n=0 ways=1
    // n=1 ways=1
    // n=2 ways=2
    // n=3 ways=3
    // n=4 ways=5

    private static int ways(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int vertical = ways(n - 1);
        int horizontal = ways(n - 2);
        return vertical + horizontal;

    }
}
