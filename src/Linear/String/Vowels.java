package Linear.String;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        System.out.println("Number of vowels:" + countVowels(input));
        sc.close();
    }

    private static int countVowels(String input) {
        int count = 0;
        for (char ch : input.toCharArray()) {
            switch (ch) {
                case 'a', 'e', 'i', 'o', 'u' -> count++;
            }
        }
        return count;
    }

}
