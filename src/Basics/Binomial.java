package Basics;

import java.util.Scanner;

public class Binomial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of items: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of items to choose: ");
        int r = sc.nextInt();
        System.out.println(BinomialCoefficient(n, r));
        sc.close();
    }

    /**
     * Calculates the binomial coefficient (nCr).
     *
     * The binomial coefficient, often denoted as nCr or C(n, r), represents the
     * number of ways to choose r items from a set of n items without repetition and
     * without order.
     * It is calculated as n! / ((n-r)! * r!), where n! represents the factorial of
     * n.
     *
     * @param n The total number of items.
     * @param r The number of items to choose.
     * @return The binomial coefficient.
     */
    public static int BinomialCoefficient(int n, int r) {
        int factorial_n = Factorial(n);
        int factorial_r = Factorial(r);
        int factorial_n_minus_r = Factorial(n - r);

        return factorial_n / (factorial_r * factorial_n_minus_r);

    }

    private static int Factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact = 1;
        while (n > 1) {
            fact *= n;
            n--;
        }
        return fact;

    }

}
