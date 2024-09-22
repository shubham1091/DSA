package Algorithms.Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.printf("%dth fibonachi number is %d", num, Fibo(num));
        sc.close();

    }

    private static int Fibo(int num) {
        if (num == 1 || num == 0) {
            return num;
        }
        return Fibo(num - 1) + Fibo(num - 2);
    }
}
