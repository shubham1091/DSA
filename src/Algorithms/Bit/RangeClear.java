package Algorithms.Bit;

import java.util.Scanner;

public class RangeClear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: "); //2515
        int number = sc.nextInt();
        System.out.print("Enter i: "); // 2
        int i = sc.nextInt();
        System.out.print("Enter j: "); // 7
        int j = sc.nextInt();
        System.out.println(clearRange(number, i, j));
        sc.close();
    }

    public static int clearRange(int n, int i, int j) {
        int leftMask = (~0) << (j + 1);
        int rightMask = (1 << i) - 1;
        int mask = leftMask | rightMask;

        return n & mask;
    }

}
