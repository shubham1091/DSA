package Algorithms.DAC;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This class demonstrates the application of merge sort to sort an array of
 * strings.
 * Assumption: All characters in all the strings are in lowercase.
 */
public class MS {

    /**
     * The main method to execute the program.
     * It reads an array of strings from the user, sorts it using merge sort, and
     * prints the sorted array.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for reading input
        System.out.print("Enter the size of array: ");
        int len = sc.nextInt(); // Read the size of the array
        String[] array = new String[len]; // Initialize the array with the given size
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < len; i++) {
            array[i] = sc.next(); // Read each element of the array
        }
        System.out.println("Original array: " + Arrays.toString(array)); // Print the original array
        mergeSort(array); // Sort the array using merge sort
        System.out.println("Sorted array: " + Arrays.toString(array)); // Print the sorted array
        sc.close(); // Close the Scanner object
    }

    /**
     * This method sorts an array of strings using merge sort algorithm.
     * 
     * @param arr The array to be sorted.
     */
    private static void mergeSort(String[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // If the array is null or has only one element, it is already sorted
        }
        String[] aux = new String[arr.length]; // Create an auxiliary array for merging
        sort(arr, aux, 0, arr.length - 1); // Call the sort method to sort the array
    }

    /**
     * This method recursively divides the array into two halves, sorts each half,
     * and merges them.
     * 
     * @param arr The array to be sorted.
     * @param aux The auxiliary array used for merging.
     * @param si  The starting index of the array segment to be sorted.
     * @param ei  The ending index of the array segment to be sorted.
     */
    private static void sort(String[] arr, String[] aux, int si, int ei) {
        if (si >= ei) {
            return; // If the starting index is greater than or equal to the ending index, return
        }
        int mid = si + (ei - si) / 2; // Find the middle index
        sort(arr, aux, si, mid); // Recursively sort the left half
        sort(arr, aux, mid + 1, ei); // Recursively sort the right half
        merge(arr, aux, si, mid, ei); // Merge the two sorted halves
    }

    /**
     * This method merges two sorted halves of the array.
     * 
     * @param arr The array to be sorted.
     * @param aux The auxiliary array used for merging.
     * @param si  The starting index of the array segment to be merged.
     * @param mid The middle index of the array segment to be merged.
     * @param ei  The ending index of the array segment to be merged.
     */
    private static void merge(String[] arr, String[] aux, int si, int mid, int ei) {
        System.arraycopy(arr, si, aux, si, ei - si + 1); // Copy the array segment to the auxiliary array

        int i = si; // Initialize the pointer for the left half
        int j = mid + 1; // Initialize the pointer for the right half
        int k = si; // Initialize the pointer for the merged array

        // Merge the two halves into the original array
        while (i <= mid && j <= ei) {
            arr[k++] = isSmaller(aux[i], aux[j]) ? aux[i++] : aux[j++];
        }

        // Copy any remaining elements from the left half
        while (i <= mid) {
            arr[k++] = aux[i++];
        }

        // Copy any remaining elements from the right half
        while (j <= ei) {
            arr[k++] = aux[j++];
        }
    }

    /**
     * This method compares two strings to determine their lexicographical order.
     * 
     * @param str1 The first string.
     * @param str2 The second string.
     * @return true if str1 is lexicographically smaller than str2, false otherwise.
     */
    private static boolean isSmaller(String str1, String str2) {
        return str1.compareTo(str2) < 0;
    }
}
