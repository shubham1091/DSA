package Linear.ArrayList;

import java.util.ArrayList;

public class FindPairSum {
    public static void main(String[] args) {
        // Create and populate the ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        // Print the list
        System.out.println("Input list: " + list);

        // Check for pairs with the target sum using both methods
        int target = 5;
        System.out.println("Brute Force method: " + PairSumBruteForce(list, target));
        System.out.println("Two Pointer method: " + PairSumTwoPointer(list, target));
    }

    /**
     * Finds if there exists any pair in the ArrayList that sums up to the target
     * using brute force.
     *
     * @param list   the ArrayList of integers
     * @param target the target sum
     * @return true if a pair with the target sum exists, false otherwise
     */
    private static boolean PairSumBruteForce(ArrayList<Integer> list, int target) {
        // Iterate through each pair of elements
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                // Check if the sum of the pair equals the target
                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Finds if there exists any pair in the sorted ArrayList that sums up to the
     * target using the two-pointer technique.
     *
     * @param list   the ArrayList of integers
     * @param target the target sum
     * @return true if a pair with the target sum exists, false otherwise
     */
    private static boolean PairSumTwoPointer(ArrayList<Integer> list, int target) {
        // Initialize two pointers
        int lp = 0; // left pointer
        int rp = list.size() - 1; // right pointer

        // Iterate while the left pointer is less than the right pointer
        while (lp < rp) {
            int sum = list.get(lp) + list.get(rp);
            // Check if the sum of the elements at the pointers equals the target
            if (sum == target) {
                return true;
            } else if (sum > target) {
                // If the sum is greater than the target, move the right pointer to the left
                rp--;
            } else {
                // If the sum is less than the target, move the left pointer to the right
                lp++;
            }
        }
        return false;
    }
}
