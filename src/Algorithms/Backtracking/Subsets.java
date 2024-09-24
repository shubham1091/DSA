package Algorithms.Backtracking;

public class Subsets {
    public static void main(String[] args) {

        find("abc", new StringBuilder(""), 0);
    }

    private static void find(String str, StringBuilder sb, int idx) {
        if (idx == str.length()) {
            System.out.println(sb.toString());
            return;
        }
        find(str, sb.append(str.charAt(idx)), idx + 1);
        sb.deleteCharAt(sb.length() - 1);
        find(str, sb, idx + 1);
    }

}
