package Basics;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int salary = sc.nextInt();
        if (salary > 10_000) {
            salary += 2000;
        } else {
            salary += 1000;
        }
        System.out.println("Your salary was: " + salary);

        if (salary > 10_000) {
            salary += 2000;
        } else if (salary > 20_000) {
            salary += 3000;
        } else {
            salary += 1000;
        }

        // bug in the code
        System.out.println("Your salary is now: " + salary);

        //----------
        System.out.println("Enter a number:");
        int cc = sc.nextInt();
        String typ = (cc % 2) == 0 ? "Even" : "Odd";
        System.out.println(typ);
        //----------

        sc.close();
    }

}
