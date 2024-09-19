package Basics;

import java.util.Scanner;

/*
 * This program counts how many times a number appears in a given number.
*/
public class CountNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // number to be checked
        int ch = sc.nextInt(); // number to be counted
        int count = 0;

        while (num > 0) {
            int rem = num % 10;
            if (rem == ch) {
                count++;
            }
            num /= 10;
        }
        System.out.printf("Number %d appears %d times ", ch, count);
        sc.close();
    }
}
