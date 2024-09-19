package Linear.Arrays.Basic;


public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] arr = { 1, -2, 6, -1, 3 };
        System.out.println(kadane(arr));
    }

    /**
     * Finds the maximum subarray sum using the brute force approach.
     * 
     * This method checks all possible subarrays and calculates their sums to find
     * the maximum sum.
     * It has a time complexity of O(n^3), where n is the length of the array.
     *
     * @param arr the input array
     * @return the maximum subarray sum
     */
    static int BruteForce(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    /**
     * Finds the maximum subarray sum using the prefix sum approach.
     * 
     * This method uses an auxiliary array to store the prefix sums of the input
     * array.
     * It then uses these prefix sums to calculate the sum of any subarray in
     * constant time.
     * It has a time complexity of O(n^2).
     *
     * @param arr the input array
     * @return the maximum subarray sum
     */
    static int prefixSum(int[] arr) {
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    /**
     * Finds the maximum subarray sum using Kadane's algorithm.
     * 
     * This is an efficient algorithm to solve the problem in linear time O(n).
     * It iterates through the array, maintaining the maximum sum of the subarray
     * ending at the current position.
     * It also handles the case where all elements in the array are negative.
     *
     * @param arr the input array
     * @return the maximum subarray sum
     */
    static int kadane(int[] arr) {
        // Check if all elements are negative
        boolean allNegative = true;
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxElement = Math.max(maxElement, arr[i]);
            if (arr[i] > 0) {
                allNegative = false;
            }
        }
        if (allNegative) {
            return maxElement;
        }

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum < 0) {
                currentSum = 0;
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        return maxSum;
    }
}
