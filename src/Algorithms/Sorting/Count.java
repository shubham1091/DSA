package Algorithms.Sorting;

import java.util.Arrays;

public class Count {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 1, 3, 2, 4, 3, 7 };
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void countSort(int[] arr) {
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        int[] countArray = new int[maxValue + 1];
        for (int i = 0; i < arr.length; i++) {
            countArray[arr[i]]++;
        }
        int index = 0;
        for (int i = 0; i < countArray.length; i++) {
            while(countArray[i]-- > 0) {
                arr[index++] = i;
            }
        }
    }
}
