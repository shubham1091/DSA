package Algorithms.Backtracking;

public class Combinations {
    // Mapping of digits to corresponding letters as on a telephone button
    final static char[][] L = {
            {}, {}, // 0 and 1 do not map to any letters
            { 'a', 'b', 'c' }, // 2
            { 'd', 'e', 'f' }, // 3
            { 'g', 'h', 'i' }, // 4
            { 'j', 'k', 'l' }, // 5
            { 'm', 'n', 'o' }, // 6
            { 'p', 'q', 'r', 's' }, // 7
            { 't', 'u', 'v' }, // 8
            { 'w', 'x', 'y', 'z' } // 9
    };

    public static void main(String[] args) {
        // Test the function with a sample input
        letterCombinations("23");
    }

    /**
     * This function initiates the backtracking process to find all possible letter combinations
     * for the given string of digits.
     * 
     * @param digits The input string containing digits from 2-9.
     */
    private static void letterCombinations(String digits) {
        int len = digits.length();
        if (len == 0) {
            System.out.println("");
            return;
        }
        // Start the backtracking process
        backtrack(0, len, new StringBuilder(), digits);
    }

    /**
     * This function uses backtracking to generate all possible letter combinations.
     * 
     * @param pos The current position in the input string.
     * @param len The length of the input string.
     * @param sb The current combination of letters being formed.
     * @param digits The input string containing digits from 2-9.
     */
    private static void backtrack(int pos, int len, StringBuilder sb, String digits) {
        // If the current position is equal to the length of the input string, print the combination
        if (pos == len) {
            System.out.println(sb.toString());
        } else {
            // Get the letters corresponding to the current digit
            char[] letters = L[Character.getNumericValue(digits.charAt(pos))];
            // Iterate through each letter and continue the backtracking process
            for (char letter : letters) {
                sb.append(letter);
                backtrack(pos + 1, len, sb, digits);
                sb.deleteCharAt(sb.length() - 1); // Backtrack
            }
        }
    }
}
