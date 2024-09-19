package Linear.Arrays.Basic;

public class PairsInArray {

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        printPairs(arr);
    }

    /**
     * Prints all unique pairs of elements in the given array.
     * Each pair is printed in the format (element1, element2).
     *
     * @param arr The array whose pairs are to be printed
     */
    private static void printPairs(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.printf("(%d,%d) ", arr[i], arr[j]);
            }
            System.out.println();
        }
        // formula to calculate total pairs: n(n-1)/2 
        int totalPairs = arr.length * (arr.length - 1) / 2;
        System.out.println("Total pairs: " + totalPairs);
    }
}
