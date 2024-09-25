package Linear.ArrayList;

import java.util.ArrayList;

public class Beautiful {

    public static void main(String[] args) {
        System.out.println("Iterative approach: " + iterative(5));
        System.out.println("Divide and Conquer approach: " + divideAndConquer(5));
    }

    /**
     * Generates a beautiful array using an iterative approach.
     *
     * @param n the size of the array
     * @return a beautiful array of size n
     */
    private static ArrayList<Integer> iterative(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        for (int i = 2; i <= n; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (Integer e : ans) {
                if (2 * e <= n) {
                    temp.add(e * 2);
                }
            }
            for (Integer e : ans) {
                if (2 * e - 1 <= n) {
                    temp.add(e * 2 - 1);
                }
            }
            ans = temp;
        }
        return ans;
    }

    /**
     * Generates a beautiful array using a divide-and-conquer approach.
     *
     * @param n the size of the array
     * @return a beautiful array of size n
     */
    private static ArrayList<Integer> divideAndConquer(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        helper(1, 1, res, n);
        return res;
    }

    /**
     * Helper method for the divide-and-conquer approach.
     *
     * @param start the starting value
     * @param increment the increment value
     * @param res the result array
     * @param n the size of the array
     */
    private static void helper(int start, int increment, ArrayList<Integer> res, int n) {
        if (start > n) {
            return;
        }
        helper(start, increment * 2, res, n);
        res.add(start);
        helper(start + increment, increment * 2, res, n);
    }
}
