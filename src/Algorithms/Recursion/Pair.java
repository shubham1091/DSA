package Algorithms.Recursion;

import java.util.Scanner;

public class Pair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of people: ");
        int numberOfPeople = sc.nextInt();
        System.out.printf("Number of wayt to arrange %d people are %d", numberOfPeople, findPairs(numberOfPeople));
        sc.close();
    }

    private static int findPairs(int n) {
        if (n <= 2) {
            return n;
        }
        int single = findPairs(n - 1);
        int pair = findPairs(n - 2) * (n - 1);
        return single + pair;
    }

}
