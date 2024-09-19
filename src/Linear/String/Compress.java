package Linear.String;

public class Compress {
    public static void main(String[] args) {
        String input = "eeeeaaabbcccdd";
        System.out.println(compressString(input));
    }

    private static String compressString(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder compressedString = new StringBuilder();
        int charCount = 1;
        char previousChar = input.charAt(0);

        for (int i = 1; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == previousChar) {
                charCount++;
            } else {
                compressedString.append(previousChar);
                if (charCount > 1) {
                    compressedString.append(charCount);
                }
                previousChar = currentChar;
                charCount = 1;
            }
        }

        // Append the last character and its count
        compressedString.append(previousChar);
        if (charCount > 1) {
            compressedString.append(charCount);
        }

        return compressedString.toString();
    }
}
