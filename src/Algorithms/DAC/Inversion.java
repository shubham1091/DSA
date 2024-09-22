package Algorithms.DAC;

/**
 * This class provides two methods to find the inversion count in an array.
 * The inversion count indicates how far the array is from being sorted.
 * If the array is already sorted, the inversion count is 0.
 * An inversion is a pair of elements a[i] and a[j] such that a[i] > a[j] and i
 * < j.
 */
public class Inversion {
    public static void main(String[] args) {
        int[] array = { 1, 20, 6, 4, 5 };
        System.out.println(countInversionsBruteForce(array)); // Find inversion count using brute force method
        System.out.println(countInversionsOptimized(array)); // Find inversion count using optimized method
    }

    /**
     * This method finds the inversion count in the array using a brute force
     * approach.
     * It checks each pair of elements and counts the inversions.
     * 
     * @param array The array of integers.
     * @return The inversion count.
     */
    private static int countInversionsBruteForce(int[] array) {
        int n = array.length;
        int inversionCount = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] > array[j]) {
                    inversionCount++;
                }
            }
        }
        return inversionCount;
    }

    /**
     * This method finds the inversion count in the array using an optimized
     * approach.
     * It uses a modified merge sort algorithm to count the inversions.
     * 
     * @param array The array of integers.
     * @return The inversion count.
     */
    private static int countInversionsOptimized(int[] array) {
        return mergeSortAndCount(array, 0, array.length - 1);
    }

    /**
     * This method recursively divides the array into two halves, sorts each half,
     * and counts the inversions during the merge process.
     * 
     * @param array The array of integers.
     * @param left  The starting index of the array segment to be sorted.
     * @param right The ending index of the array segment to be sorted.
     * @return The inversion count.
     */
    private static int mergeSortAndCount(int[] array, int left, int right) {
        int inversionCount = 0;
        if (right > left) {
            int mid = (right + left) / 2;

            inversionCount = mergeSortAndCount(array, left, mid);
            inversionCount += mergeSortAndCount(array, mid + 1, right);
            inversionCount += mergeAndCount(array, left, mid + 1, right);
        }
        return inversionCount;
    }

    /**
     * This method merges two sorted halves of the array and counts the inversions.
     * 
     * @param array The array of integers.
     * @param left  The starting index of the array segment to be merged.
     * @param mid   The middle index of the array segment to be merged.
     * @param right The ending index of the array segment to be merged.
     * @return The inversion count.
     */
    private static int mergeAndCount(int[] array, int left, int mid, int right) {
        int i = left, j = mid, k = 0;
        int inversionCount = 0;
        int[] temp = new int[right - left + 1];

        while (i < mid && j <= right) {
            if (array[i] <= array[j]) {
                temp[k] = array[i];
                k++;
                i++;
            } else {
                temp[k] = array[j];
                inversionCount += mid - i;
                k++;
                j++;
            }
        }

        while (i < mid) {
            temp[k] = array[i];
            i++;
            k++;
        }
        while (j <= right) {
            temp[k] = array[j];
            k++;
            j++;
        }
        for (i = left, k = 0; i <= right; i++, k++) {
            array[i] = temp[k];
        }
        return inversionCount;
    }
}
