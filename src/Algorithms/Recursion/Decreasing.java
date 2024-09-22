package Algorithms.Recursion;

import java.util.Scanner;

public class Decreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        iterat(num);
        rec(num);

        sc.close();
    }

    private static void iterat(int num) {
        for (int i = num; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void rec(int num) {
        if (num <=0) {
            System.out.println();
            return;
        }
        System.out.print(num-- + " ");
        rec(num);
    }
}