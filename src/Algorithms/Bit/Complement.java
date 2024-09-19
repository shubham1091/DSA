package Algorithms.Bit;

import java.util.Scanner;

public class Complement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int firstNum = sc.nextInt();

        System.out.printf("result of one's complement of %d = %d", firstNum, ~firstNum);

        sc.close();
    }

}
