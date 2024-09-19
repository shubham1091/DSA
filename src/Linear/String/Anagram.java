package Linear.String;

public class Anagram {
    public static void main(String[] args) {
        String firstString = "race";
        String secondString = "care";
        System.out.println(areAnagrams(firstString, secondString));
    }

    private static boolean areAnagrams(String firstString, String secondString) {
        // Early termination if lengths are not equal
        if (firstString.length() != secondString.length()) {
            return false;
        }

        int[] characterFrequency = new int[52]; // 26 for lowercase + 26 for uppercase

        for (char character : firstString.toCharArray()) {
            if (Character.isLowerCase(character)) {
                characterFrequency[character - 'a']++;
            } else if (Character.isUpperCase(character)) {
                characterFrequency[character - 'A' + 26]++;
            }
        }

        for (char character : secondString.toCharArray()) {
            if (Character.isLowerCase(character)) {
                characterFrequency[character - 'a']--;
            } else if (Character.isUpperCase(character)) {
                characterFrequency[character - 'A' + 26]--;
            }
        }

        for (int frequency : characterFrequency) {
            if (frequency != 0) {
                return false;
            }
        }

        return true;
    }
}
