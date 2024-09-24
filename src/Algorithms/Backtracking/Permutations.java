package Algorithms.Backtracking;

public class Permutations {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("abc");
        StringBuilder ans = new StringBuilder();
        combination(str, ans);
    }

    private static void combination(StringBuilder str, StringBuilder ans) {
        if (str.length() == 0) {
            System.out.println(ans.toString());
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            ans.append(curr);
            str.deleteCharAt(i);
            combination(str, ans);
            str.insert(i, curr); // backtrack
            ans.deleteCharAt(ans.length() - 1); // backtrack
        }
    }
}
