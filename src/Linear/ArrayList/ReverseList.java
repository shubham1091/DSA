package Linear.ArrayList;

import java.util.ArrayList;

public class ReverseList {
    public static void main(String[] args) {
        // Create an ArrayList and add elements to it
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Print the original list
        System.out.println("Original list: " + list);

        // Call the reverse method to print the list in reverse order
        reverse(list);
    }

    /**
     * Prints the elements of the given ArrayList in reverse order.
     *
     * @param list the ArrayList to be reversed
     */
    private static void reverse(ArrayList<Integer> list) {
        int size = list.size();
        // Iterate from the last element to the first element
        for (int i = size - 1; i >= 0; i--) {
            // Print each element followed by a space
            System.out.print(list.get(i) + " ");
        }
        // Print a newline character after printing all elements
        System.out.println();
    }
}
