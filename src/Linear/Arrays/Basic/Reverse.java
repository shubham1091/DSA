package Linear.Arrays.Basic;


public class Reverse {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        reverse(arr);
        print(arr);
    }

    /**
     * Reverses the elements of the given array in place.
     *
     * @param arr The array to be reversed
     */
    public static void reverse(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    /**
     * Swaps the elements at the specified positions in the given array.
     *
     * @param arr The array in which the elements are to be swapped
     * @param i   The index of one element to be swapped
     * @param j   The index of the other element to be swapped
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        // Alternative swap without using a temporary variable
        // arr[i] = arr[i] + arr[j];
        // arr[j] = arr[i] - arr[j];
        // arr[i] = arr[i] - arr[j];
    }

    /**
     * Prints the elements of the given array to the standard output.
     *
     * @param arr The array whose elements are to be printed
     */
    private static void print(int[] arr) {
        for (int itm : arr) {
            System.out.print(itm + " ");
        }
        System.out.println();
    }
}
