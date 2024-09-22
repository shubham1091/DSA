package Algorithms.Recursion;

public class CheckSorted {
    public static void main(String[] args) {
        int[] array = { 1, 5, 3, 4 };
        System.err.println(isSorted(array, 0));
    }

    private static boolean isSorted(int[] arr, int i) {
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

}
