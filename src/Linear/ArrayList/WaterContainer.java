package Linear.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class WaterContainer {
    public static void main(String[] args) {
        // Sample input heights
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

        // Creating an ArrayList with the same heights
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        // Printing the input arrays
        System.out.println("Height array: " + Arrays.toString(height));
        System.out.println("list arraylist: " + list);

        System.out.println("Two Pointer heihgt: " + twoPointer(height));
        System.out.println("Two Pointer list: " + twoPointer(list));
    }

    /**
     * This method calculates the maximum water container volume using the
     * two-pointer approach.
     * 
     * @param height An array of integers representing the heights of the container
     *               walls.
     * @return The maximum volume of water that can be contained.
     */
    private static int twoPointer(int[] height) {
        int max = 0;
        int lp = 0; // Left pointer
        int rp = height.length - 1; // Right pointer

        while (lp < rp) {
            int minHeight = Math.min(height[lp], height[rp]);
            int width = rp - lp;
            int volume = minHeight * width;
            if (volume > max) {
                max = volume;
            }
            if (height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            }
        }
        return max;
    }

    /**
     * This method calculates the maximum water container volume using the
     * two-pointer approach.
     * 
     * @param height An ArrayList of integers representing the heights of the
     *               container walls.
     * @return The maximum volume of water that can be contained.
     */
    private static int twoPointer(ArrayList<Integer> height) {
        int max = 0;
        int lp = 0; // Left pointer
        int rp = height.size() - 1; // Right pointer

        while (lp < rp) {
            int minHeight = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int volume = minHeight * width;
            if (volume > max) {
                max = volume;
            }
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return max;
    }

    /**
     * This method calculates the maximum water container volume using the
     * brute-force approach.
     * 
     * @param height An array of integers representing the heights of the container
     *               walls.
     * @return The maximum volume of water that can be contained.
     */
    private static int BruteForce(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int minHeight = Math.min(height[i], height[j]);
                int width = j - i;
                int volume = minHeight * width;
                if (volume > max) {
                    max = volume;
                }
            }
        }
        return max;
    }

    /**
     * This method calculates the maximum water container volume using the
     * brute-force approach.
     * 
     * @param height An ArrayList of integers representing the heights of the
     *               container walls.
     * @return The maximum volume of water that can be contained.
     */
    private static int BruteForce(ArrayList<Integer> height) {
        int max = 0;
        for (int i = 0; i < height.size() - 1; i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int minHeight = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int volume = minHeight * width;
                if (volume > max) {
                    max = volume;
                }
            }
        }
        return max;
    }
}
