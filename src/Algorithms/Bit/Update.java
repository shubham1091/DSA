package Algorithms.Bit;

import java.util.Scanner;

public class Update {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.print("Enter index: ");
        int index = sc.nextInt();
        System.out.print("Enter update value: ");
        int val = sc.nextInt();
        System.out.println(updateIthBit(number, index, val)); 
        System.out.println(update(number, index, val)); 
        sc.close();
    }

    private static int updateIthBit(int n, int i, int val) {
        if (val == 0) {
            return Operations.clearIthBit(n, i);
        } else {
            return Operations.setIthBit(n, i);
        }
    }

    public static int update(int n, int i, int val){
        int mask = val << i;

        int temp = n & (~(1<<i));

        return temp|mask;
    }

}
