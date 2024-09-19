package Algorithms.Bit;

import java.util.Scanner;

public class And {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNum = sc.nextInt();
        System.out.print("Enter second  number: ");
        int secondNum = sc.nextInt();

        System.out.printf("Result of %d & %d = %d", firstNum, secondNum, firstNum & secondNum);

        sc.close();
    }
}
