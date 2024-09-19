package Linear.String;

public class Upper {
    public static void main(String[] args) {
        String s = "hi, i am shubham";
        System.err.println(propperCase(s));
    }

    private static String propperCase(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder sb = new StringBuilder();

        boolean capitalizeNext = true;
        for (char ch : str.toCharArray()) {
            if (Character.isWhitespace(ch)) {
                capitalizeNext = true;
            } else if (capitalizeNext) {
                ch = Character.toUpperCase(ch);
                capitalizeNext = false;
            }
            sb.append(ch);
        }
        return sb.toString();
    }

}
