package Algorithms.Searching.Linear;

/**
 * LeetCode 1295
 * This class provides a method to find how many numbers in a given array
 * contain an even number of digits.
 * 
 * Example:
 * Input: nums = [12, 345, 2, 6, 7896]
 * Output: 2
 * Explanation: 12 and 7896 contain an even number of digits.
 */
public class FindMin {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        System.out.println(findNumbers(nums)); // Expected output: 2
    }

    /**
     * This method takes an array of integers and returns the count of numbers
     * that have an even number of digits.
     * 
     * @param nums An array of integers.
     * @return The count of numbers with an even number of digits.
     */
    public static int findNumbers(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int numberOfDigits = 0;
            int value = nums[i];

            while (value > 0) {
                value /= 10;
                numberOfDigits++;
            }

            if (numberOfDigits % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
