package Linear.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Lonely {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);

        System.out.println("Input list: " + list);
        System.out.println("Lonely numbers: " + findLonely(list));
    }

    /**
     * Finds all lonely numbers in the given ArrayList.
     * A number is considered lonely if it appears only once and no adjacent numbers (i.e., x+1 and x-1) appear in the list.
     *
     * @param nums the ArrayList of integers to check
     * @return an ArrayList of lonely numbers
     */
    private static ArrayList<Integer> findLonely(ArrayList<Integer> nums) {
        // Sort the list to make it easier to find adjacent numbers
        Collections.sort(nums);
        ArrayList<Integer> lonelyNumbers = new ArrayList<>();

        // Handle edge cases for lists with 0 or 1 element
        if (nums.size() == 1) {
            lonelyNumbers.add(nums.get(0));
            return lonelyNumbers;
        }

        // Check the first element
        if (nums.get(0) + 1 < nums.get(1)) {
            lonelyNumbers.add(nums.get(0));
        }

        // Check the middle elements
        for (int i = 1; i < nums.size() - 1; i++) {
            if (nums.get(i - 1) + 1 < nums.get(i) && nums.get(i) + 1 < nums.get(i + 1)) {
                lonelyNumbers.add(nums.get(i));
            }
        }

        // Check the last element
        if (nums.get(nums.size() - 2) + 1 < nums.get(nums.size() - 1)) {
            lonelyNumbers.add(nums.get(nums.size() - 1));
        }

        return lonelyNumbers;
    }
}
