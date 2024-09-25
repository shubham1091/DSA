package Linear.ArrayList;

import java.util.ArrayList;

public class Monotonic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);

        if (isMonotonic(list)) {
            System.out.println("list is monotonic");
        } else {
            System.out.println("list is not monotonic");
        }
    }

    /**
     * Checks if the given ArrayList is monotonic.
     * An ArrayList is monotonic if it is either monotone increasing or monotone decreasing.
     *
     * @param list the ArrayList to check
     * @return true if the list is monotonic, false otherwise
     */
    private static boolean isMonotonic(ArrayList<Integer> list) {
        if (list.size() <= 1) {
            return true; // A list with 0 or 1 element is trivially monotonic
        }

        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > list.get(i - 1)) {
                decreasing = false;
            }
            if (list.get(i) < list.get(i - 1)) {
                increasing = false;
            }
        }

        return increasing || decreasing;
    }
}
