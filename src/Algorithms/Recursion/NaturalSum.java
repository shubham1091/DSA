package Algorithms.Recursion;

import java.util.Scanner;

public class NaturalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println(sum(num));
        sc.close();
    }

    private static int sum(int num) {
        if (num == 0) {
            return 0;
        }
        return num + sum(num - 1);
    }
}
