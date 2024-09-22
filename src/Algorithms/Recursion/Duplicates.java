package Algorithms.Recursion;

import java.util.Scanner;

public class Duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.next();
        process(str);
        sc.close();
    }

    private static void process(String str) {
        boolean[] map = new boolean[26];
        StringBuilder sb = new StringBuilder();
        removeDuplicates(str, 0, sb, map);
    }

    private static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean[] map) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char current = str.charAt(idx);
        if (!map[current - 'a']) {
            newStr.append(current);
            map[current - 'a'] = true;
        }
        removeDuplicates(str, idx + 1, newStr, map);
    }

}
