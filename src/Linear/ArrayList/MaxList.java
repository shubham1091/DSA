package Linear.ArrayList;

import java.util.ArrayList;

public class MaxList {
    public static void main(String[] args) {
        // Create an ArrayList and add some integers to it
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        // Print the original list
        System.out.println("Original list: " + list);

        // Find and print the maximum value in the list
        System.out.println("Maximum value: " + max(list));
    }

    /**
     * Finds the maximum value in the given ArrayList.
     *
     * @param list the ArrayList of integers to check
     * @return the maximum value in the list
     */
    private static int max(ArrayList<Integer> list) {
        // Initialize the maximum value with the first element of the list
        int max = list.get(0);

        // Iterate through the list starting from the second element
        for (int i = 1; i < list.size(); i++) {
            // Update the maximum value if the current element is greater
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        // Return the maximum value found
        return max;
    }
}
