package Algorithms.Bit;

import java.util.Scanner;

public class Exp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.print("Enter power: ");
        int power = sc.nextInt();
        System.out.println(pow(number, power));
        sc.close();
    }

    private static int pow(int n, int i) {
        int ans = 1;
        while (i > 0) {
            if ((i & 1) != 0) {
                ans *= n;
            }
            n *= n;
            i >>= 1;
        }
        return ans;
    }

}
