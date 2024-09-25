package Linear.ArrayList;

import java.util.ArrayList;

public class Target {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(100);
        nums.add(200);
        nums.add(1);
        nums.add(100);

        System.out.println("Input list: " + nums);
        System.out.println("Most frequent target: " + mostFrequent(nums, 1));
    }

    /**
     * Finds the target number that most frequently follows the given key in the
     * ArrayList.
     *
     * @param nums the ArrayList of integers to check
     * @param key  the integer key to look for
     * @return the target number that most frequently follows the key
     */
    private static int mostFrequent(ArrayList<Integer> nums, int key) {
        // Assuming the numbers are within a certain range, e.g., 0 to 1000
        int[] countArray = new int[1001];

        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) == key) {
                int target = nums.get(i + 1);
                countArray[target]++;
            }
        }

        // Find the target with the maximum count
        int maxCount = 0;
        int mostFrequentTarget = -1;
        for (int i = 0; i < countArray.length; i++) {
            if (countArray[i] > maxCount) {
                maxCount = countArray[i];
                mostFrequentTarget = i;
            }
        }

        return mostFrequentTarget;
    }
}
