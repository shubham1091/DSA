package Algorithms.DAC;

/**
 * This class provides two methods to find the majority element in an array.
 * The majority element is the element that appears more than n/2 times.
 * The class includes a brute force method and an optimized divide-and-conquer method.
 */
public class Majority {

    /**
     * The main method to execute the program.
     * It initializes an array of integers and prints the majority element found by both methods.
     * 
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1, 2, 2, 2 };
        System.out.println(findMajorityElementBruteForce(nums)); // Find majority element using brute force method
        System.out.println(findMajorityElementOptimized(nums));  // Find majority element using optimized method
    }

    /**
     * This method finds the majority element in the array using a brute force approach.
     * It checks each element and counts its occurrences in the array.
     * 
     * @param nums The array of integers.
     * @return The majority element if found, otherwise -1.
     */
    private static int findMajorityElementBruteForce(int[] nums) {
        int majorityCount = nums.length / 2;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }
            if (count > majorityCount) {
                return nums[i];
            }
        }
        return -1;
    }

    /**
     * This method finds the majority element in the array using a divide-and-conquer approach.
     * 
     * @param nums The array of integers.
     * @return The majority element.
     */
    private static int findMajorityElementOptimized(int[] nums) {
        return findMajorityElement(nums, 0, nums.length - 1);
    }

    /**
     * This method recursively finds the majority element in a subarray.
     * It divides the array into two halves, finds the majority element in each half,
     * and then combines the results.
     * 
     * @param nums The array of integers.
     * @param lo The starting index of the subarray.
     * @param hi The ending index of the subarray.
     * @return The majority element in the subarray.
     */
    private static int findMajorityElement(int[] nums, int lo, int hi) {
        if (lo == hi) {
            return nums[lo];
        }

        int mid = lo + (hi - lo) / 2;
        int left = findMajorityElement(nums, lo, mid);
        int right = findMajorityElement(nums, mid + 1, hi);

        if (left == right) {
            return left;
        }

        int leftCount = countOccurrencesInRange(nums, left, lo, hi);
        int rightCount = countOccurrencesInRange(nums, right, lo, hi);

        return leftCount > rightCount ? left : right;
    }

    /**
     * This method counts the occurrences of a given number in a subarray.
     * 
     * @param nums The array of integers.
     * @param num The number to count.
     * @param lo The starting index of the subarray.
     * @param hi The ending index of the subarray.
     * @return The count of the number in the subarray.
     */
    private static int countOccurrencesInRange(int[] nums, int num, int lo, int hi) {
        int count = 0;
        for (int i = lo; i <= hi; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }
}
