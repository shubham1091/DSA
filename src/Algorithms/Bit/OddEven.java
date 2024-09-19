package Algorithms.Bit;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        if((number & 1)==1){
            System.out.println("number is Odd");
        }else{
            System.out.println("number is Even");
        }
        sc.close();
    }

}
