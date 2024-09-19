package Linear.Arrays.Basic;

/**
 * Trapping Rainwater
 * Given n non-negative integers representing an elevation map
 * where the width of each bar is 1, compute how much water
 * it can trap after raining.
 */
public class TrappingRainwater {
    public static void main(String[] args) {
        int[] height = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(auxiliary(height));
        System.out.println(TwoPointers(height));
    }

    /**
     * Auxiliary Array Approach
     * 
     * This approach uses two auxiliary arrays to store the maximum height to the
     * left and right of each bar.
     * 
     * Steps:
     * 1. Create an array `leftMax` where `leftMax[i]` contains the maximum height
     * from the left up to index `i`.
     * 2. Create an array `rightMax` where `rightMax[i]` contains the maximum height
     * from the right up to index `i`.
     * 3. Iterate through the height array and for each bar, calculate the trapped
     * water as the minimum of `leftMax[i]` and `rightMax[i]` minus the height of
     * the bar itself.
     * 
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * 
     * @param height array representing the elevation map
     * @return total amount of trapped water
     */
    static int auxiliary(int[] height) {
        int size = height.length;

        int[] leftMax = new int[size];
        leftMax[0] = height[0];
        for (int i = 1; i < size; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        int[] rightMax = new int[size];
        rightMax[size - 1] = height[size - 1];
        for (int i = size - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int trappedWater = 0;
        for (int i = 0; i < size; i++) {
            trappedWater += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return trappedWater;
    }

    /**
     * Two Pointers Approach
     * 
     * This approach uses two pointers to traverse the height array from both ends.
     * 
     * Steps:
     * 1. Initialize two pointers `left` and `right` at the beginning and end of the
     * array, respectively.
     * 2. Maintain two variables `leftMax` and `rightMax` to store the maximum
     * height encountered so far from the left and right, respectively.
     * 3. Move the pointers towards each other, updating `leftMax` and `rightMax`
     * and calculating the trapped water based on the minimum of these two values.
     * 
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * 
     * @param height array representing the elevation map
     * @return total amount of trapped water
     */
    static int TwoPointers(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int trappedWater = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    trappedWater += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    trappedWater += rightMax - height[right];
                }
                right--;
            }
        }
        return trappedWater;
    }
}
