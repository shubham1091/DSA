package Algorithms.Bit;

import java.util.Scanner;

public class Clear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        System.out.print("Enter i: ");
        int i = sc.nextInt();
        System.out.println(clearIBits(number, i));
        sc.close();
    }

    public static int clearIBits(int n, int i) {
        int mask = (~0) << i;
        return n & mask;
    }


}
