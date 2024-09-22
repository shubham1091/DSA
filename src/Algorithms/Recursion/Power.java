package Algorithms.Recursion;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = Integer.parseInt(sc.nextLine());
        System.out.print("Enter n: ");
        int n = Integer.parseInt(sc.nextLine());

        // Calculate power using both methods
        System.out.println("Result using simple recursion: " + pow(x, n));
        System.out.println("Result using optimized recursion: " + optimizedPow(x, n));

        sc.close();
    }

    private static int pow(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * pow(base, exponent - 1);
    }

    private static int optimizedPow(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        int halfPower = optimizedPow(base, exponent / 2);
        int halfPowerSq = halfPower * halfPower;
        if (exponent % 2 == 0) {
            return halfPowerSq;
        } else {
            return base * halfPowerSq;
        }
    }
}
