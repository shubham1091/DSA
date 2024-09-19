package Linear.Arrays.Basic;

public class PrintSubarrays {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        getSubarrays(arr);
    }

    public static void getSubarrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                printSubarrays(arr, i, j);
            }
            System.out.println();
        }
    }

    private static void printSubarrays(int[] arr, int start, int end) {
        System.out.print("[");
        for (int i = start; i <= end; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.print("]");
    }
}
