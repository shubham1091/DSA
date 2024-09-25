package Linear.ArrayList;

import java.util.ArrayList;

public class FindPairSumRotated {
    public static void main(String[] args) {
        // Create and populate the ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        // Print the list
        System.out.println("Input list: " + list);

        // Check for pairs with the target sum in the rotated list
        int target = 16;
        System.out.println("Pair with target sum exists: " + PairSumRotated(list, target));
    }

    /**
     * Finds if there exists any pair in the sorted and rotated ArrayList that sums
     * up to the target.
     *
     * @param list   the ArrayList of integers
     * @param target the target sum
     * @return true if a pair with the target sum exists, false otherwise
     */
    private static boolean PairSumRotated(ArrayList<Integer> list, int target) {
        // Find the pivot point where the array is rotated
        int pivot = -1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                pivot = i;
                break;
            }
        }

        // Initialize two pointers
        int lp = (pivot + 1) % list.size(); // left pointer starts from the smallest element
        int rp = pivot; // right pointer starts from the largest element

        // Iterate until the two pointers meet
        while (lp != rp) {
            int sum = list.get(lp) + list.get(rp);
            // Check if the sum of the elements at the pointers equals the target
            if (sum == target) {
                return true;
            } else if (sum < target) {
                // If the sum is less than the target, move the left pointer to the right
                lp = (lp + 1) % list.size();
            } else {
                // If the sum is greater than the target, move the right pointer to the left
                rp = (list.size() + rp - 1) % list.size();
            }
        }
        return false;
    }
}
