package Algorithms.Searching.Linear;

/**
 * find the largest number in a given array
 */
public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 6, 3, 5 };
        System.out.println(getLargest(arr));
    }

    static int getSmallest(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int getLargest(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
