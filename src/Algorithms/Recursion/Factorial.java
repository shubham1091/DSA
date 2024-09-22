package Algorithms.Recursion;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        System.out.println(fact(BigInteger.valueOf(num)));
        System.out.println(itr(num));
        sc.close();
    }

    private static BigInteger fact(BigInteger num) {
        if (num.equals(BigInteger.ZERO) || num.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        }

        return num.multiply(fact(num.subtract(BigInteger.ONE)));
    }

    private static BigInteger itr(int num) {
        BigInteger fact = BigInteger.valueOf(1);
        for (int i = 1; i <= num; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
}
