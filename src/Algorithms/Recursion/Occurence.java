package Algorithms.Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int len = sc.nextInt(); // 9

        int[] array = new int[len]; // [8, 3, 6, 9, 5, 10, 2, 5, 3]
        for (int i = 0; i < len; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
        System.out.print("Enter the key: ");
        int key = sc.nextInt(); // 5
        System.out.println(first(array, key, 0));
        System.out.println(last(array, key, len - 1));
        sc.close();

    }

    private static int first(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return first(arr, key, i + 1);
    }

    private static int last(int[] arr, int key, int i) {
        if (i < 0) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return last(arr, key, i - 1);
    }

    private static void allOccurence(int[] arr, int key, int i) {
        if (i == arr.length) {
            System.out.println();
            return;
        }
        if (arr[i] == key) {
            System.out.print(i + " ");
        }
        allOccurence(arr, key, i + 1);
    }

}
