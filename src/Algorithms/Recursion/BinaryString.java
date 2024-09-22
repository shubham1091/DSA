package Algorithms.Recursion;

import java.util.Scanner;

public class BinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of string: ");
        int len = sc.nextInt();
        print(len, 0, new StringBuilder());
        sc.close();
    }

    private static void print(int n, int last, StringBuilder str) {
        if (n == 0) {
            System.out.println(str.toString());
            return;
        }
        if (last == 0) {
            str.append("1");
            print(n - 1, 1, str);
            str.deleteCharAt(str.length() - 1); // backtrack
        }
        str.append("0");
        print(n - 1, 0, str);
        str.deleteCharAt(str.length() - 1); // backtrack
    }
}
