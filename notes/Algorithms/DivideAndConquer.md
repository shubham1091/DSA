# Divide & Conquer

## Merge Sort

Approach

- Divide=>mid
- mergeSort(left), mergeSort(right)
- merge

```java
import java.util.Arrays;
import java.util.Scanner;

public class className {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of array: ");
        int len = sc.nextInt();

        // Initialize the array with the specified length
        int[] arr = new int[len];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        // Print the original array
        System.out.println("Original array: " + Arrays.toString(arr));

        // Sort the array using merge sort
        mergeSort(arr);

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // Close the scanner
        sc.close();
    }

    /**
     * Sorts the given array using the merge sort algorithm.
     *
     * @param arr The array to be sorted.
     */
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        int[] aux = new int[arr.length];
        sort(arr, aux, 0, arr.length - 1);
    }

    /**
     * Recursively sorts the subarray from index si to ei using merge sort.
     *
     * @param arr The array to be sorted.
     * @param aux Auxiliary array used for merging.
     * @param si  Starting index of the subarray.
     * @param ei  Ending index of the subarray.
     */
    private static void sort(int[] arr, int[] aux, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        sort(arr, aux, si, mid); // left part
        sort(arr, aux, mid + 1, ei); // right part
        merge(arr, aux, si, mid, ei);
    }

    /**
     * Merges two sorted subarrays into a single sorted subarray.
     *
     * @param arr The array containing the subarrays to be merged.
     * @param aux Auxiliary array used for merging.
     * @param si  Starting index of the first subarray.
     * @param mid Ending index of the first subarray.
     * @param ei  Ending index of the second subarray.
     */
    private static void merge(int[] arr, int[] aux, int si, int mid, int ei) {
        // Copy the elements from the original array to the auxiliary array
        System.arraycopy(arr, si, aux, si, ei - si + 1);

        int i = si; // Iterator for the left part
        int j = mid + 1; // Iterator for the right part
        int k = si; // Iterator for the merged array

        // Merge the two sorted subarrays
        while (i <= mid && j <= ei) {
            arr[k++] = aux[i] <= aux[j] ? aux[i++] : aux[j++];
        }

        // Copy any remaining elements from the left part
        while (i <= mid) {
            arr[k++] = aux[i++];
        }

        // Copy any remaining elements from the right part
        while (j <= ei) {
            arr[k++] = aux[j++];
        }
    }
}

```

## Quick sort

pivot & partition

- choose pivot
- partition (parts)
- quickSort(left),quickSort(right)

```java
import java.util.Scanner;
import java.util.Arrays;

public class className {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of array: ");
        int len = sc.nextInt();

        // Initialize the array with the specified length
        int[] arr = new int[len];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        // Print the original array
        System.out.println("Original array: " + Arrays.toString(arr));

        // Sort the array using merge sort
        quickSort(arr,0,arr.length-1);

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // Close the scanner
        sc.close();
    }

    /**
     * Sorts the array using the QuickSort algorithm.
     *
     * @param arr The array to be sorted.
     * @param si  The starting index of the subarray to be sorted.
     * @param ei  The ending index of the subarray to be sorted.
     */
    public static void quickSort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx - 1);
        quickSort(arr, pIdx + 1, ei);
    }

    /**
     * Partitions the array around a pivot element.
     *
     * @param arr The array to be partitioned.
     * @param si  The starting index of the subarray to be partitioned.
     * @param ei  The ending index of the subarray to be partitioned.
     * @return The index of the pivot element after partitioning.
     */
    private static int partition(int[] arr, int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, ei);
        return i + 1;
    }

    /**
     * Swaps two elements in the array.
     *
     * @param arr The array in which elements are to be swapped.
     * @param i   The index of the first element.
     * @param j   The index of the second element.
     */
    private static void swap(int[] arr, int i, int j) {
        if (i != j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}

```

**Problem** apply merge sort to sort an array of strings (assume that all the characters in all the strings are in lowercase)
code: [MS.java](../../src/Algorithms/DAC/MS.java)

**Problem** Given an array nums of size n, return the majority element

> The majority element is the element that apperes more than n/2 times. you may assume that the majority element always exists in the array

> constraints
>
> - n==nums.length
> - 1<=n<=5\*104
> - -109<=nums[i]<=109

code: [Majority.java](../../src/Algorithms/DAC/Majority.java)

**Problem** Given an array of integers. Find the `inversion count` in the array

> ` Inversion count`: for an array, inversion count indicates how far (or close) the array is from being sorted if the array is already sorted then the inversion count is 0. if an array is formally, two element a[i] and a[j] form an inversion if a[i]>a[j] and i<j

code: [Inversion.java](../../src/Algorithms/DAC/Inversion.java)