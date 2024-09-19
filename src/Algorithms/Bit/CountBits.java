package Algorithms.Bit;

import java.util.Scanner;

public class CountBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println(count(number));
        sc.close();
    }

    private static int count(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n >>= 1;
        }
        return count;

    }

}
