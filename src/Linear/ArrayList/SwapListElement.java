package Linear.ArrayList;

import java.util.ArrayList;

public class SwapListElement {
    public static void main(String[] args) {
        // Create an ArrayList and add elements to it
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        // Print the original list
        System.out.println("Original list: " + list);

        // Call the swap method to swap elements at index 1 and index 3
        swap(list, 1, 3);

        // Print the list after swapping
        System.out.println("List after swapping: " + list);
    }

    /**
     * Swaps the elements at the specified indices in the given ArrayList.
     *
     * @param list the ArrayList in which elements are to be swapped
     * @param idx1 the index of the first element to be swapped
     * @param idx2 the index of the second element to be swapped
     */
    private static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        // Store the element at idx1 in a temporary variable
        int temp = list.get(idx1);
        // Set the element at idx1 to the element at idx2
        list.set(idx1, list.get(idx2));
        // Set the element at idx2 to the element stored in the temporary variable
        list.set(idx2, temp);
    }
}
