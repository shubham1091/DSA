package Algorithms.Recursion;

import java.util.Scanner;

public class Increasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        inc(num);
        sc.close();
    }

    private static void inc(int num){
        if(num<=0){
            System.out.println();
            return;
        }
        inc(num-1);
        System.out.print(num+" ");
    }
    
}
