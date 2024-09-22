package Algorithms.Recursion;

import java.util.Scanner;

public class Spell {

    static final String[] digits = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        print(number, new StringBuilder());
        print(number);
        sc.close();
    }

    private static void print(int number, StringBuilder str) {
        if (number == 0) {
            System.out.println(str.toString().trim());
            return;
        }
        int digit = number % 10;
        number /= 10;
        print(number, str.insert(0, " " + digits[digit]));
    }

    private static void print(int number) {
        if (number == 0) {
            return;
        }
        int lastDigit = number % 10;
        print(number / 10);
        System.out.print(digits[lastDigit] + " ");
    }

}
